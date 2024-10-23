package org.example.cowsay

import com.github.ricksbrown.cowsay.plugin.CowExecutor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class CowSayController {

    @GetMapping("")
    fun say():String{
        val cowExecutor = CowExecutor()
        cowExecutor.setMessage("Hi")
        cowExecutor.setHtml(true)
        val result = cowExecutor.execute()
        return result
    }
}