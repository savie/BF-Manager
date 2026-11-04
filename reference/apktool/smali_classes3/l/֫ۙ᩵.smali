.class public final Ll/֫ۙ᩵;
.super Ll/ܺ۠ۗ;
.source "I6DC"


# direct methods
.method public static ۙ([Ll/ᩳۡۗ;I)I
    .locals 3

    .line 160
    array-length v0, p0

    :cond_0
    add-int/lit8 p1, p1, 0x1

    if-ge p1, v0, :cond_1

    .line 162
    aget-object v1, p0, p1

    if-eqz v1, :cond_0

    .line 163
    invoke-virtual {v1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v1

    sget-object v2, Ll/᩺ۢۗ;->᩶ۙ:Ll/᩺ۢۗ;

    if-eq v1, v2, :cond_0

    return p1

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static ۙ(Ll/ۖۡۗ;[Ll/ᩳۡۗ;II)V
    .locals 2

    .line 153
    :try_start_0
    aget-object p1, p1, p3

    sget-object v0, Ll/ۧ۟ۗ;->᩺:Ll/ۧ۟ۗ;

    new-instance v1, Ll/۫ᩳۗ;

    invoke-direct {v1, p2, p3}, Ll/۫ᩳۗ;-><init>(II)V

    invoke-virtual {p1, v0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 155
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to set jump: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Ll/۠֫᩵;->ۙ(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " -> "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p3}, Ll/۠֫᩵;->ۙ(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    invoke-static {p0, p2, p1}, Ll/᩺֫᩵;->ۙ(Ll/᩺ۡۗ;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static ۙ([Ll/ᩳۡۗ;ILl/ᩳۡۗ;Ll/֫֨ۗ;)V
    .locals 2

    .line 137
    invoke-static {p0, p1}, Ll/֫ۙ᩵;->ۙ([Ll/ᩳۡۗ;I)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 141
    :cond_0
    aget-object p1, p0, p1

    .line 142
    invoke-virtual {p1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    sget-object v1, Ll/᩺ۢۗ;->ۛۙ:Ll/᩺ۢۗ;

    if-eq v0, v1, :cond_1

    :goto_0
    return-void

    .line 145
    :cond_1
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v0

    .line 146
    invoke-virtual {v0, p3}, Ll/ۛ֨ۗ;->᩷(Ll/֫֨ۗ;)Ll/ۛ֨ۗ;

    move-result-object p3

    invoke-virtual {p2, p3}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    .line 430
    invoke-virtual {p2, p1}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    .line 431
    invoke-virtual {p2, p1}, Ll/ۚᩳۗ;->ۙ(Ll/ۚᩳۗ;)V

    .line 183
    invoke-virtual {p1}, Ll/ᩳۡۗ;->getOffset()I

    move-result p1

    const/4 p2, 0x0

    aput-object p2, p0, p1

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 12

    .line 37
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_8

    .line 41
    :cond_0
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۙ()[Ll/ᩳۡۗ;

    move-result-object v0

    const/4 v1, 0x0

    .line 45
    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_c

    .line 46
    aget-object v2, v0, v1

    if-nez v2, :cond_1

    goto/16 :goto_7

    .line 50
    :cond_1
    sget-object v3, Ll/ۚۙ᩵;->ۙ:[I

    invoke-virtual {v2}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/4 v4, 0x0

    const/4 v5, -0x1

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_7

    .line 105
    :pswitch_0
    check-cast v2, Ll/ۧۢۗ;

    .line 106
    invoke-virtual {v2}, Ll/ۧۢۗ;->ܰۙ()I

    move-result v3

    .line 172
    array-length v5, v0

    move v6, v3

    :goto_1
    if-ge v6, v5, :cond_3

    .line 174
    aget-object v7, v0, v6

    if-eqz v7, :cond_2

    .line 175
    invoke-virtual {v7}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v8

    sget-object v9, Ll/᩺ۢۗ;->᩶ۙ:Ll/᩺ۢۗ;

    if-eq v8, v9, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    move-object v7, v4

    :goto_2
    if-eqz v7, :cond_4

    .line 108
    invoke-virtual {v7}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v5

    sget-object v6, Ll/᩺ۢۗ;->ᩴۙ:Ll/᩺ۢۗ;

    if-ne v5, v6, :cond_4

    .line 109
    move-object v3, v7

    check-cast v3, Ll/֫ۢۗ;

    invoke-virtual {v2, v3}, Ll/ۧۢۗ;->ۙ(Ll/֫ۢۗ;)V

    .line 183
    invoke-virtual {v7}, Ll/ᩳۡۗ;->getOffset()I

    move-result v2

    aput-object v4, v0, v2

    goto/16 :goto_7

    .line 112
    :cond_4
    new-instance p1, Ll/۠ۧ᩵;

    invoke-static {v3}, Ll/۠֫᩵;->ۙ(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Payload for fill-array not found at "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 112
    throw p1

    .line 100
    :pswitch_1
    move-object v3, v2

    check-cast v3, Ll/᩻ۢۗ;

    invoke-virtual {v3}, Ll/᩻ۢۗ;->᩵ۙ()Ll/֫֨ۗ;

    move-result-object v3

    .line 101
    invoke-static {v0, v1, v2, v3}, Ll/֫ۙ᩵;->ۙ([Ll/ᩳۡۗ;ILl/ᩳۡۗ;Ll/֫֨ۗ;)V

    goto/16 :goto_7

    .line 94
    :pswitch_2
    invoke-virtual {v2}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v3

    if-nez v3, :cond_b

    .line 95
    sget-object v3, Ll/֫֨ۗ;->۟:Ll/֫֨ۗ;

    invoke-static {v0, v1, v2, v3}, Ll/֫ۙ᩵;->ۙ([Ll/ᩳۡۗ;ILl/ᩳۡۗ;Ll/֫֨ۗ;)V

    goto/16 :goto_7

    .line 86
    :pswitch_3
    invoke-virtual {v2}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v3

    if-nez v3, :cond_b

    .line 87
    move-object v3, v2

    check-cast v3, Ll/ܳۢۗ;

    invoke-virtual {v3}, Ll/ܳۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩷ۢۗ;->ۤ()Ll/֫֨ۗ;

    move-result-object v3

    .line 88
    invoke-static {v0, v1, v2, v3}, Ll/֫ۙ᩵;->ۙ([Ll/ᩳۡۗ;ILl/ᩳۡۗ;Ll/֫֨ۗ;)V

    goto/16 :goto_7

    .line 78
    :pswitch_4
    check-cast v2, Ll/ۖ֨ۗ;

    invoke-virtual {v2}, Ll/ۖ֨ۗ;->᩵ۙ()I

    move-result v2

    invoke-static {p1, v0, v1, v2}, Ll/֫ۙ᩵;->ۙ(Ll/ۖۡۗ;[Ll/ᩳۡۗ;II)V

    .line 79
    invoke-static {v0, v1}, Ll/֫ۙ᩵;->ۙ([Ll/ᩳۡۗ;I)I

    move-result v2

    if-eq v2, v5, :cond_b

    .line 81
    invoke-static {p1, v0, v1, v2}, Ll/֫ۙ᩵;->ۙ(Ll/ۖۡۗ;[Ll/ᩳۡۗ;II)V

    goto/16 :goto_7

    .line 74
    :pswitch_5
    check-cast v2, Ll/ܺۢۗ;

    invoke-virtual {v2}, Ll/ܺۢۗ;->᩵ۙ()I

    move-result v2

    invoke-static {p1, v0, v1, v2}, Ll/֫ۙ᩵;->ۙ(Ll/ۖۡۗ;[Ll/ᩳۡۗ;II)V

    goto/16 :goto_7

    .line 66
    :pswitch_6
    invoke-static {v0, v1}, Ll/֫ۙ᩵;->ۙ([Ll/ᩳۡۗ;I)I

    move-result v3

    if-eq v3, v5, :cond_5

    .line 68
    invoke-static {p1, v0, v1, v3}, Ll/֫ۙ᩵;->ۙ(Ll/ۖۡۗ;[Ll/ᩳۡۗ;II)V

    .line 70
    :cond_5
    check-cast v2, Ll/ܽۢۗ;

    invoke-virtual {v2}, Ll/ܽۢۗ;->᩵ۙ()I

    move-result v2

    invoke-static {p1, v0, v1, v2}, Ll/֫ۙ᩵;->ۙ(Ll/ۖۡۗ;[Ll/ᩳۡۗ;II)V

    goto :goto_7

    .line 52
    :pswitch_7
    check-cast v2, Ll/֨ۢۗ;

    .line 53
    invoke-virtual {v2}, Ll/֨ۢۗ;->֡ۙ()Z

    move-result v3

    if-eqz v3, :cond_9

    .line 123
    invoke-static {v0, v1}, Ll/֫ۙ᩵;->ۙ([Ll/ᩳۡۗ;I)I

    move-result v3

    .line 124
    invoke-virtual {v2}, Ll/֨ۢۗ;->᩵ۙ()I

    move-result v6

    .line 172
    array-length v7, v0

    move v8, v6

    :goto_3
    if-ge v8, v7, :cond_7

    .line 174
    aget-object v9, v0, v8

    if-eqz v9, :cond_6

    .line 175
    invoke-virtual {v9}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v10

    sget-object v11, Ll/᩺ۢۗ;->᩶ۙ:Ll/᩺ۢۗ;

    if-eq v10, v11, :cond_6

    goto :goto_4

    :cond_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_7
    move-object v9, v4

    :goto_4
    if-eqz v9, :cond_8

    .line 126
    invoke-virtual {v9}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v7

    sget-object v8, Ll/᩺ۢۗ;->ۜۙ:Ll/᩺ۢۗ;

    if-ne v7, v8, :cond_8

    .line 127
    move-object v6, v9

    check-cast v6, Ll/ۢۢۗ;

    .line 128
    invoke-virtual {v6, v1}, Ll/ۢۢۗ;->۫(I)V

    .line 129
    invoke-virtual {v2, v6, v3}, Ll/֨ۢۗ;->ۙ(Ll/ۢۢۗ;I)V

    .line 183
    invoke-virtual {v9}, Ll/ᩳۡۗ;->getOffset()I

    move-result v3

    aput-object v4, v0, v3

    goto :goto_5

    .line 132
    :cond_8
    new-instance p1, Ll/۠ۧ᩵;

    invoke-static {v6}, Ll/۠֫᩵;->ۙ(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Payload for switch not found at "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 132
    throw p1

    .line 56
    :cond_9
    :goto_5
    invoke-virtual {v2}, Ll/֨ۢۗ;->᩺ۙ()I

    move-result v3

    if-eq v3, v5, :cond_a

    .line 58
    invoke-static {p1, v0, v1, v3}, Ll/֫ۙ᩵;->ۙ(Ll/ۖۡۗ;[Ll/ᩳۡۗ;II)V

    .line 60
    :cond_a
    invoke-virtual {v2}, Ll/֨ۢۗ;->ܿۙ()[I

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_6
    if-ge v4, v3, :cond_b

    aget v5, v2, v4

    .line 61
    invoke-static {p1, v0, v1, v5}, Ll/֫ۙ᩵;->ۙ(Ll/ۖۡۗ;[Ll/ᩳۡۗ;II)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_b
    :goto_7
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_c
    :goto_8
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
