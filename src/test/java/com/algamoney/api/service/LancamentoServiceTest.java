package com.algamoney.api.service;

import com.algamoney.api.model.Lancamento;
import com.algamoney.api.model.Pessoa;
import com.algamoney.api.repository.PessoaRepository;
import com.algamoney.api.service.exception.PessoaInexistenteOuInativaException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LancamentoServiceTest {

    @InjectMocks
    private LancamentoService lancamentoService;

    @Mock
    private PessoaRepository pessoaRepository;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void deveLancarExceptionAoCriarLancamentoParaPessoaInativa(){
        Lancamento lancamento = new Lancamento();
        Pessoa pessoa = new Pessoa();
        pessoa.setCodigo(123l);
        lancamento.setPessoa(pessoa);

        expectedException.expect(PessoaInexistenteOuInativaException.class);
        when(pessoaRepository.getOne(anyLong())).thenReturn(null);

        lancamentoService.salvar(lancamento);
    }

}