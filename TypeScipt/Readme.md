# Typescript : The stricter sibling of JavaScript

Typescript, a language developed by Microsoft, is a fully typed language which starts and ends on Javascript much like it's sibling but is also friends with other languages like Java and C++, reminding you always to write code in good practises.

> Always keep your types in check and dont forget your dose of semi-colons, or i might throw some errors your way

## Installation

You can download the source code from TypeScript and build it locally on your system. It is available as a public repo on [Github](https://github.com/Microsoft/TypeScript)

Or you can install Typescript as a package using `npm` or `yarn`. So it's a no-brainer that you have to first install Node.js itself.

You can do so on Linux based platform from your terminal itself using your package manager. On Windows we are not fortunate enough to have a good package manager already installed. If you have `choco` installed, good for you.

Or you can simply use the following [link](https://nodejs.org/en/download/) and select your OS and download option. My advice will be to go with the LTS version (mostly used in organisation for stability).

Using NPM :

```bash
npm install -g typescript
```

Using Yarn :

```bash
yarn global add typescript
```

This will add typescript cli tools to your path and you will be able to compile typescript files straight from the terminal/cmd.

To install the typescript language locally, do the following:

Using NPM :

```bash
npm install typescript --save-dev
```

Using Yarn:

```bash
yarn add typescript --dev
```

## Compile

Typescript files end with the `.ts` extension and using the typescript cli command `tsc`.

Just point your terminal/cmd to the directory containing TypeScript files and do this:

```bash
tsc file.ts
```

## Project Setup

Now you are ready to go with developing programs in TypeScript. There plently of applications where you can start using TS. Angular is by default using TS.

You can also setup a pure TypeScript project locally using the TS node module/ cli tool `tsc`

```bash
# For global installations
tsc --init

# For local installations
./node_modules/.bin/tsc --init

# Using npx
npx tsc --init
```

> You can learn more about `npx` and how it is used right [here]()

## References

1. [How to Install and Start Using TypeScript](https://www.freecodecamp.org/news/how-to-install-and-begin-using-typescript/)

2. [Setting Up a New TypeScript Project
   ](https://alligator.io/typescript/new-project/)

3. [Typescript Official Page](https://www.typescriptlang.org)