package com.sena.inventarioapp.feature.product.data.mapper

import com.sena.inventarioapp.feature.product.data.local.ProductEntity
import com.sena.inventarioapp.feature.product.data.remote.ProductDto

fun ProductEntity.toDto() = ProductDto(
    id = id,
    name = name,
    description = description,
    priceCop = priceCop,
    quantity = quantity,
    updatedAt = updatedAt,
    isDeleted = isDeleted
)

fun ProductDto.toEntity() = ProductEntity(
    id = id,
    name = name,
    description = description,
    priceCop = priceCop,
    quantity = quantity,
    updatedAt = updatedAt,
    pending = false,
    isDeleted = isDeleted
)