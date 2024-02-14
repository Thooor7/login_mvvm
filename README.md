# Login App
Este é um aplicativo simples de login com uma estrutura básica em Kotlin para Android. O aplicativo utiliza a arquitetura MVVM (Model-View-ViewModel) para separação de preocupações e LiveData para atualizações reativas na interface do usuário.

# Principais Ferramentas Utilizadas

## 1. ViewModel e LiveData
Descrição: Componentes da arquitetura Android Jetpack para gerenciamento do ciclo de vida e comunicação entre a camada de visualização e modelo.
### Uso: Utilizados para manter a lógica de apresentação fora das atividades/fragmentos e permitir uma comunicação reativa.
## 2. View Binding
Descrição: Substituto do findViewById, gera classes de ligação específicas para as visualizações no layout.
### Uso: Utilizado para acessar facilmente os elementos da interface do usuário sem a necessidade de chamadas repetitivas de findViewById.
Estrutura do Código
## 3. MainActivity
Descrição: Atividade principal que gerencia a interface do usuário e as interações com o usuário.
### Principais Funções:
Realiza a inicialização da interface do usuário.
Inicia o ViewModel.
Observa as mudanças no ViewModel.
## 4. MainViewModel
Descrição: Mantém a lógica de apresentação separada da atividade e fornece dados para a interface do usuário.
### Principais Funções:
Mantém dados observáveis usando LiveData.
Possui métodos para realizar a lógica de negócios.
## 5. MainRepository
Descrição: Camada de repositório simulada para manipulação de dados.
### Principais Funções:
Contém métodos simulados para realizar operações de login.

Este aplicativo simples serve como um ponto de partida para um projeto Android utilizando Kotlin e a arquitetura MVVM.
