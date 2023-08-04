package com.cheezycode.quizzed.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cheezycode.quizzed.R

import androidx.core.view.isGone
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import io.github.sceneview.ar.ArSceneView
import io.github.sceneview.ar.node.ArModelNode

class Warangalfort : AppCompatActivity() {

    private lateinit var sceneView: ArSceneView
    private lateinit var placeButton: ExtendedFloatingActionButton
    private  lateinit var modelNode: ArModelNode

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_warangalfort)
        sceneView = findViewById(R.id.sceneView)
        placeButton = findViewById(R.id.place)
        placeButton.setOnClickListener {
            placeModel()
        }

        modelNode = ArModelNode().apply {
            loadModelGlbAsync(
                glbFileLocation = "models/fort_warangal_india_-_test_bake.glb"


            )
            {
                sceneView.planeRenderer.isVisible = true
            }
            onAnchorChanged = {
                placeButton.isGone
            }
        }
        sceneView.addChild(modelNode)
    }
    private fun placeModel()
    {
        modelNode.anchor()
        sceneView.planeRenderer.isVisible=false
    }
    }
