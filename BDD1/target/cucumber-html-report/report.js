$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/cadastro.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Cadastrar um usuário",
  "description": "",
  "id": "cadastrar-um-usuário",
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 6636850312,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Usuário cadastrado com sucesso",
  "description": "",
  "id": "cadastrar-um-usuário;usuário-cadastrado-com-sucesso",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 6,
  "name": "que eu faço o login",
  "keyword": "Dado "
});
formatter.match({
  "location": "CadastroStepDefinitions.que_eu_faço_o_login()"
});
formatter.result({
  "duration": 2764482510,
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefinitions.CadastroStepDefinitions.que_eu_faço_o_login(CadastroStepDefinitions.java:28)\r\n\tat ✽.Dado que eu faço o login(src/test/resources/features/cadastro.feature:6)\r\n",
  "status": "failed"
});
});