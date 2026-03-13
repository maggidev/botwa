# BotWA Integrated (Termux Source)

Este projeto é uma versão customizada do Termux integrada diretamente no pacote `com.brx.botwa`.

## Estrutura do Projeto

*   `app`: Módulo principal com a interface do usuário e lógica do bot.
*   `terminal-emulator`: Código-fonte do emulador de terminal do Termux.
*   `terminal-view`: Componentes de visualização do terminal.
*   `termux-shared`: Bibliotecas compartilhadas do ecossistema Termux.

## Como Compilar

1.  Clone este repositório.
2.  Abra no Android Studio.
3.  Certifique-se de ter o **Android NDK** instalado.
4.  O projeto está configurado para usar o pacote `com.brx.botwa`.

## Integração do Bot

O bot de WhatsApp está localizado em `app/src/main/assets/bot`. Ao iniciar o terminal, o app executa automaticamente o script de bootstrap para configurar o Node.js e rodar o bot.

## GitHub Actions

O workflow em `.github/workflows/android.yml` compila automaticamente o APK e disponibiliza nos artefatos do GitHub.
