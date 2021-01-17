package com.github.api.data

import androidx.versionedparcelable.VersionedParcelize

@VersionedParcelize
data class User (
    val login: String,
    val avatarUrl: String,
    val htmlUrl: String,
    val followersUrl: String,
    val followers: Int,
    val followingUrl: String,
    val following: Int,
    val reposUrl: String,
    val repos: Int
)