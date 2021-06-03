# ClojureScript Starter

A minimal clojurescript + reagent project (using shadow-cljs)

## Getting Started

- install node
- clone this repo
- in terminal, from within this repo:
    - `npm install`

- if using Atom + Chlorine:
  - `npm start`
  - (wait)
  - open http://localhost:8080
  - Cmd-Shift-P and search for 'Chlorine: Connect Socket REPL'
  - (accept the default ports)
  - Cmd-Shift-P ad search for 'Chlorine: Connect Embedded'
  - you should now be able to evaluate code in REPL window that opens, or directly from files (via keyboard shortcuts)

- if using VSCode+Calva:

  - click "nREPL" in the bottom bar
  - when prompted, select 'Start a REPL...'
  - when prompted, select ':dev'
  - (wait)
  - when prompted with 'Select which build to connect to', select ':dev'
  - open http://localhost:8080
  - you should now be able to evaluate code in REPL window that opens, or directly from files (via keyboard shortcuts)

- if using Vim+Fireplace

  - `npm start`
  - (wait)
  - open http://localhost:8080
  - in Vim, enter the command: `:Piggieback dev`
  - you should now be able to evaluate code (via :Require, cpp, or c!!)

- edit `./src/demo/ui.cljs` (ex. change "Hello World" to "Hello Bob")
- you should see it live-update in the browser
