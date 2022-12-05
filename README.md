# Dando vida ao APP! -> Utilizando Botões e atribuindo eventos à eles (setOnClickListener)

[![HCkIEpS.png](https://iili.io/HCkIEpS.png)](https://freeimage.host/)

### 1. Criando o Projeto

### 2. Criando os botões

Criar os botões é uma tarefa muuuito fácil. Você pode criar através do Design ou através do XML.

[![HCknVf4.md.png](https://iili.io/HCknVf4.md.png)](https://freeimage.host/i/HCknVf4)

Para criar através do código, utilize o código abaixo:

```Kotlin
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:paddingLeft="16dp"
    android:paddingTop="16dp"
    android:paddingRight="16dp" >


    <Button
        android:id="@+id/botaoVermelho"
        android:layout_width="199dp"
        android:layout_height="160dp"
        android:layout_centerHorizontal="true"
        android:backgroundTint="#FF0000"
        android:layout_marginTop="100dp"
        android:text="Vermelho"
        tools:ignore="MissingConstraints"
        tools:layout_editor_absoluteX="106dp"
        tools:layout_editor_absoluteY="285dp" />

    <Button
        android:id="@+id/botaoVerde"
        android:layout_width="199dp"
        android:layout_height="160dp"
        android:text="Verde"
        android:layout_centerHorizontal="true"
        android:backgroundTint="#00FF00"
        tools:ignore="MissingConstraints"
        android:layout_below="@id/botaoVermelho"/>
    <Button
        android:id="@+id/botaoAzul"
        android:layout_width="199dp"
        android:layout_height="160dp"
        android:text="Azul"
        android:layout_centerHorizontal="true"
        tools:ignore="MissingConstraints"
        android:backgroundTint="#0000FF"
        android:layout_below="@id/botaoVerde"/>
</RelativeLayout>
```

### 3. Entendendo como criamos os botões:

[![HCkIIpI.png](https://iili.io/HCkIIpI.png)](https://freeimage.host/)

Antes de tudo é importante conhecer os tipos de posicionamento, você pode acessar este guia:
Utilizaremos o Relative Layout.

[![HCkx4N1.md.png](https://iili.io/HCkx4N1.md.png)](https://freeimage.host/i/HCkx4N1)

a. Devemos dar um nome ao Botão: ` android:id="@+id/botaoVermelho"`
b. Devemos atribuir uma cor: `android:backgroundTint="#FF0000"` (Aqui utilizei o padrão RGB, RRGGBB, para alterar a Cor, é só posicionar o par FF. Por exemplo, azul 00FF00)
c. Indicar a posição: `android:layout_below="@id/botaoVermelho"/>` (Como estamos tratando de posicionamento relativo, a posição deste botão é relativa à base do anterior)

Exemplo:

```Kotlin
<Button
        android:id="@+id/botaoVerde"
        android:layout_width="199dp"
        android:layout_height="160dp"
        android:text="Verde"
        android:layout_centerHorizontal="true"
        android:backgroundTint="#00FF00"
        tools:ignore="MissingConstraints"
        android:layout_below="@id/botaoVermelho"/>
    <Button
        android:id="@+id/botaoAzul"
        android:layout_width="199dp"
        android:layout_height="160dp"
        android:text="Azul"
        android:layout_centerHorizontal="true"
        tools:ignore="MissingConstraints"
        android:backgroundTint="#0000FF"
        android:layout_below="@id/botaoVerde"/>
```

### 4. Agora é só atribuir os eventos!

>>> Abra o arquivo MainActivity.kt

a. Realize as declarações, faazendo menção ao ID do botão através do R pelo FindViewByID 

```Kotlin
val botaoVerde : Button = findViewById(R.id.botaoVerde)
val botaoVermelho : Button = findViewById(R.id.botaoVermelho)
val botaoAzul : Button = findViewById(R.id.botaoAzul)
```

b. Crie os eventos através do clique, e dentro da função utilize o `TOAST` que já utilizamos na aula 1.
Ao tocar no botão, deverá ser exibida o nome da cor.

[![HCkTu8Q.png](https://iili.io/HCkTu8Q.png)](https://freeimage.host/)

#### 5. Segue o código completo:

```Kotlin
package com.example.android_utilizandobotoeskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoVerde : Button = findViewById(R.id.botaoVerde)
        val botaoVermelho : Button = findViewById(R.id.botaoVermelho)
        val botaoAzul : Button = findViewById(R.id.botaoAzul)

        botaoVerde.setOnClickListener{
            Toast.makeText(applicationContext, "A cor é verde!", Toast.LENGTH_SHORT).show()
        }

        botaoVermelho.setOnClickListener{
            Toast.makeText(applicationContext, "A cor é vermelha", Toast.LENGTH_SHORT).show()
        }

        botaoAzul.setOnClickListener {
            Toast.makeText(applicationContext, "A cor é azul", Toast.LENGTH_SHORT).show()
        }
    }
}
```

Grande abraço!
Guilherme Freitas

Dezembro de 2022

### Referências:
Toast - documentação oficial: https://developer.android.com/guide/topics/ui/notifiers/toasts
Botões - documentação oficial: https://developer.android.com/guide/topics/ui/controls/button?hl=pt-br
