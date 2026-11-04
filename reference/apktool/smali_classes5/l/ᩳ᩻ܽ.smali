.class public abstract Ll/ᩳ᩻ܽ;
.super Ll/ܿ᩻ܽ;
.source "Y2PE"


# virtual methods
.method public abstract ۙ(IILjava/lang/String;)I
.end method

.method public final ۙ(ILjava/lang/String;)Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 164
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v2

    .line 167
    invoke-static {}, Ll/۟᩻ܽ;->ۙ()[C

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v5, v3

    const/4 v6, 0x0

    const/4 v7, 0x0

    move/from16 v3, p1

    :goto_0
    const-string v8, "Cannot increase internal buffer any further"

    if-ge v3, v2, :cond_d

    if-ge v3, v2, :cond_c

    add-int/lit8 v9, v3, 0x1

    .line 254
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v10

    const v11, 0xd800

    if-lt v10, v11, :cond_4

    const v11, 0xdfff

    if-le v10, v11, :cond_0

    goto :goto_1

    :cond_0
    const v11, 0xdbff

    const-string v12, "\'"

    const-string v13, " in \'"

    const-string v14, " at index "

    const-string v15, "\' with value "

    if-gt v10, v11, :cond_3

    if-ne v9, v2, :cond_1

    neg-int v10, v10

    goto :goto_1

    .line 264
    :cond_1
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v11

    .line 265
    invoke-static {v11}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v16

    if-eqz v16, :cond_2

    .line 266
    invoke-static {v10, v11}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v10

    goto :goto_1

    .line 268
    :cond_2
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Expected low surrogate but got char \'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 279
    :cond_3
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Unexpected low surrogate character \'"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_4
    :goto_1
    if-ltz v10, :cond_b

    .line 179
    invoke-virtual {v0, v10}, Ll/ᩳ᩻ܽ;->ۙ(I)[C

    move-result-object v9

    .line 180
    invoke-static {v10}, Ljava/lang/Character;->charCount(I)I

    move-result v10

    add-int/2addr v10, v3

    if-eqz v9, :cond_a

    sub-int v11, v3, v6

    add-int v12, v7, v11

    .line 186
    array-length v13, v9

    add-int/2addr v13, v12

    .line 187
    array-length v14, v5

    if-ge v14, v13, :cond_7

    sub-int v14, v2, v3

    add-int/2addr v14, v13

    add-int/lit8 v14, v14, 0x20

    if-ltz v14, :cond_6

    .line 306
    new-array v8, v14, [C

    if-lez v7, :cond_5

    .line 308
    invoke-static {v5, v4, v8, v4, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_5
    move-object v5, v8

    goto :goto_2

    .line 304
    :cond_6
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v8}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :cond_7
    :goto_2
    if-lez v11, :cond_8

    .line 193
    invoke-virtual {v1, v6, v3, v5, v7}, Ljava/lang/String;->getChars(II[CI)V

    move v7, v12

    .line 196
    :cond_8
    array-length v3, v9

    if-lez v3, :cond_9

    .line 197
    array-length v3, v9

    invoke-static {v9, v4, v5, v7, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 198
    array-length v3, v9

    add-int/2addr v7, v3

    :cond_9
    move v6, v10

    .line 203
    :cond_a
    invoke-virtual {v0, v10, v2, v1}, Ll/ᩳ᩻ܽ;->ۙ(IILjava/lang/String;)I

    move-result v3

    goto/16 :goto_0

    .line 174
    :cond_b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Trailing high surrogate at end of input"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 291
    :cond_c
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "Index exceeds specified range"

    invoke-direct {v1, v2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_d
    sub-int v3, v2, v6

    if-lez v3, :cond_11

    add-int/2addr v3, v7

    .line 211
    array-length v9, v5

    if-ge v9, v3, :cond_10

    if-ltz v3, :cond_f

    .line 306
    new-array v8, v3, [C

    if-lez v7, :cond_e

    .line 308
    invoke-static {v5, v4, v8, v4, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_e
    move-object v5, v8

    goto :goto_3

    .line 304
    :cond_f
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v8}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    .line 214
    :cond_10
    :goto_3
    invoke-virtual {v1, v6, v2, v5, v7}, Ljava/lang/String;->getChars(II[CI)V

    move v7, v3

    .line 217
    :cond_11
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v5, v4, v7}, Ljava/lang/String;-><init>([CII)V

    return-object v1
.end method

.method public abstract ۙ(I)[C
.end method
