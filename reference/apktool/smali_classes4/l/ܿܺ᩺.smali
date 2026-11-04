.class public final Ll/ܿܺ᩺;
.super Ljava/lang/Object;
.source "2B5C"


# static fields
.field public static ۙ:Z

.field public static ᩷:Z


# direct methods
.method public static ۙ(II[I)I
    .locals 5

    .line 46
    array-length v0, p2

    .line 48
    array-length v1, p2

    add-int/lit8 v1, v1, -0x2

    move v2, v1

    move v1, p0

    :goto_0
    if-lt v1, p1, :cond_0

    .line 50
    aget v3, p2, v1

    rem-int/2addr v3, v0

    if-le v3, p0, :cond_0

    sub-int v2, p0, v1

    add-int/lit8 v2, v2, 0x1

    sub-int v2, v1, v2

    move v4, v2

    move v2, v1

    move v1, v4

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, -0x1

    .line 54
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    :goto_1
    add-int/lit8 v1, p1, 0x1

    if-le v2, v1, :cond_2

    add-int v1, p1, v2

    shr-int/lit8 v1, v1, 0x1

    .line 58
    aget v3, p2, v1

    rem-int/2addr v3, v0

    if-le v3, p0, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    move p1, v1

    goto :goto_1

    :cond_2
    return v2
.end method

.method public static ۙ(Ll/ۧۛۚ;)Lbin/mt/json/JSONObject;
    .locals 5

    .line 36
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 37
    iget-object v1, p0, Ll/ۧۛۚ;->֫:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 41
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "path"

    .line 42
    invoke-virtual {v2, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "temporary"

    const/4 v3, 0x1

    .line 43
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_apk_workspace_open"

    const-string v3, "inspect"

    const-string v4, "Open built APK as a temporary workspace for one-time inspection"

    .line 38
    invoke-static {v1, v2, v3, v4}, Ll/ۖܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    .line 56
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "workspaceId"

    iget-object v3, p0, Ll/ۧۛۚ;->᩹:Ljava/lang/String;

    .line 57
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "editSessionId"

    iget-object v3, p0, Ll/ۧۛۚ;->ۚ:Ljava/lang/String;

    .line 58
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "outputPath"

    iget-object v3, p0, Ll/ۧۛۚ;->ۧ:Ljava/lang/String;

    .line 59
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "apkFileName"

    iget-object v3, p0, Ll/ۧۛۚ;->᩷:Ljava/lang/String;

    .line 60
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "size"

    iget-wide v3, p0, Ll/ۧۛۚ;->ܶ:J

    .line 61
    invoke-virtual {v1, v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "signingPerformed"

    iget-boolean v3, p0, Ll/ۧۛۚ;->ܽ:Z

    .line 62
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, p0, Ll/ۧۛۚ;->᩻:Ljava/util/ArrayList;

    .line 63
    invoke-static {v2}, Ll/ۨᩴۚ;->ۙ(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v2

    const-string v3, "signSchemes"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, p0, Ll/ۧۛۚ;->ܺ:Ll/᩸ۗۚ;

    const/4 v3, 0x0

    .line 64
    invoke-static {v2, v3}, Ll/ܽ᩵ۚ;->ۙ(Ll/᩸ۗۚ;Z)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "signatureSummary"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, p0, Ll/ۧۛۚ;->᩸:Ljava/util/ArrayList;

    .line 65
    invoke-static {v2}, Ll/ۨᩴۚ;->ۙ(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v2

    const-string v3, "changedDexEntries"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "changedClassCount"

    iget v3, p0, Ll/ۧۛۚ;->ۤ:I

    .line 66
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "deletedClassCount"

    iget v3, p0, Ll/ۧۛۚ;->ܳ:I

    .line 67
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, p0, Ll/ۧۛۚ;->ۙ:Ljava/util/ArrayList;

    .line 68
    invoke-static {v2}, Ll/ۨᩴۚ;->ۙ(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v2

    const-string v3, "addedZipEntries"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, p0, Ll/ۧۛۚ;->ᩴ:Ljava/util/ArrayList;

    .line 69
    invoke-static {v2}, Ll/ۨᩴۚ;->ۙ(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v2

    const-string v3, "changedZipEntries"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object p0, p0, Ll/ۧۛۚ;->۫:Ljava/util/ArrayList;

    .line 70
    invoke-static {p0}, Ll/ۨᩴۚ;->ۙ(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object p0

    const-string v2, "deletedZipEntries"

    invoke-virtual {v1, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 45
    invoke-static {p0, v0}, Ll/ܳۧۤ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(III)V
    .locals 3

    const-string v0, "Start index ("

    if-ltz p1, :cond_2

    const-string v1, ")"

    if-gt p1, p2, :cond_1

    if-gt p2, p0, :cond_0

    return-void

    .line 77
    :cond_0
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v0, "End index ("

    const-string v2, ") is greater than array length ("

    .line 0
    invoke-static {v0, p2, v2, v1, p0}, Ll/֡᩷᩸;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    .line 77
    invoke-direct {p1, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 76
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v2, ") is greater than end index ("

    .line 0
    invoke-static {v0, p1, v2, v1, p2}, Ll/֡᩷᩸;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    .line 76
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 75
    :cond_2
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string p2, ") is negative"

    .line 0
    invoke-static {p1, v0, p2}, Ll/ܰ۟ۙ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 75
    invoke-direct {p0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۙ([I)V
    .locals 12

    .line 189
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_11

    const/4 v3, 0x2

    if-eq v0, v3, :cond_10

    .line 76
    array-length v0, p0

    .line 78
    aget v4, p0, v1

    aget v5, p0, v2

    add-int/2addr v4, v5

    aput v4, p0, v1

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/4 v6, 0x0

    :goto_0
    add-int/lit8 v7, v0, -0x1

    if-ge v4, v7, :cond_4

    if-ge v5, v0, :cond_1

    .line 82
    aget v7, p0, v6

    aget v8, p0, v5

    if-ge v7, v8, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 83
    :cond_1
    :goto_1
    aget v8, p0, v6

    add-int/lit8 v7, v6, 0x1

    .line 84
    aput v4, p0, v6

    move v6, v7

    :goto_2
    if-ge v5, v0, :cond_3

    if-ge v6, v4, :cond_2

    .line 89
    aget v7, p0, v6

    aget v9, p0, v5

    if-ge v7, v9, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v7, v5, 0x1

    .line 93
    aget v5, p0, v5

    add-int/2addr v8, v5

    move v5, v7

    goto :goto_4

    .line 90
    :cond_3
    :goto_3
    aget v7, p0, v6

    add-int/2addr v8, v7

    add-int/lit8 v7, v6, 0x1

    add-int v9, v4, v0

    .line 91
    aput v9, p0, v6

    move v6, v7

    .line 96
    :goto_4
    aput v8, p0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 110
    :cond_4
    array-length v0, p0

    sub-int/2addr v0, v3

    const/4 v4, 0x1

    :goto_5
    const/16 v5, 0x13

    if-ge v4, v5, :cond_5

    if-le v0, v2, :cond_5

    add-int/lit8 v0, v0, -0x1

    .line 112
    invoke-static {v0, v1, p0}, Ll/ܿܺ᩺;->ۙ(II[I)I

    move-result v0

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 204
    :cond_5
    aget v4, p0, v1

    array-length v5, p0

    rem-int/2addr v4, v5

    if-lt v4, v0, :cond_7

    .line 126
    array-length v0, p0

    sub-int/2addr v0, v3

    .line 127
    array-length v4, p0

    sub-int/2addr v4, v2

    :goto_6
    if-lez v3, :cond_f

    add-int/lit8 v5, v0, -0x1

    .line 131
    invoke-static {v5, v1, p0}, Ll/ܿܺ᩺;->ۙ(II[I)I

    move-result v5

    sub-int/2addr v0, v5

    sub-int/2addr v3, v0

    :goto_7
    if-lez v3, :cond_6

    add-int/lit8 v6, v4, -0x1

    .line 134
    aput v2, p0, v4

    add-int/lit8 v3, v3, -0x1

    move v4, v6

    goto :goto_7

    :cond_6
    shl-int/lit8 v3, v0, 0x1

    add-int/lit8 v2, v2, 0x1

    move v0, v5

    goto :goto_6

    :cond_7
    add-int/lit8 v1, v0, -0x1

    .line 207
    invoke-static {v1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v1

    rsub-int/lit8 v1, v1, 0x20

    rsub-int/lit8 v4, v1, 0x14

    .line 151
    array-length v5, p0

    sub-int/2addr v5, v3

    .line 152
    array-length v6, p0

    sub-int/2addr v6, v2

    if-ne v4, v2, :cond_8

    goto :goto_8

    :cond_8
    const/4 v3, 0x1

    :goto_8
    if-ne v4, v2, :cond_9

    add-int/lit8 v7, v0, -0x2

    goto :goto_9

    :cond_9
    move v7, v0

    :goto_9
    shl-int/lit8 v8, v3, 0x1

    :goto_a
    if-lez v8, :cond_f

    if-gt v5, v0, :cond_a

    move v9, v5

    goto :goto_b

    :cond_a
    add-int/lit8 v9, v5, -0x1

    .line 158
    invoke-static {v9, v0, p0}, Ll/ܿܺ᩺;->ۙ(II[I)I

    move-result v9

    :goto_b
    if-lt v3, v4, :cond_b

    sub-int v10, v3, v4

    shl-int v10, v2, v10

    .line 162
    invoke-static {v7, v10}, Ljava/lang/Math;->min(II)I

    move-result v10

    goto :goto_c

    :cond_b
    rsub-int/lit8 v10, v1, 0x13

    if-ne v3, v10, :cond_d

    .line 165
    aget v10, p0, v9

    if-ne v10, v5, :cond_c

    add-int/lit8 v9, v9, 0x1

    :cond_c
    const/4 v10, 0x1

    goto :goto_c

    :cond_d
    const/4 v10, 0x0

    :goto_c
    sub-int/2addr v5, v9

    add-int/2addr v5, v10

    sub-int/2addr v8, v5

    :goto_d
    if-lez v8, :cond_e

    add-int/lit8 v11, v6, -0x1

    .line 171
    aput v3, p0, v6

    add-int/lit8 v8, v8, -0x1

    move v6, v11

    goto :goto_d

    :cond_e
    sub-int/2addr v7, v10

    shl-int/lit8 v8, v5, 0x1

    add-int/lit8 v3, v3, 0x1

    move v5, v9

    goto :goto_a

    :cond_f
    return-void

    .line 191
    :cond_10
    aput v2, p0, v2

    .line 193
    :cond_11
    aput v2, p0, v1

    return-void
.end method

.method public static ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-eq p0, p1, :cond_1

    if-eqz p0, :cond_0

    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ۙ(I[B)[B
    .locals 2

    .line 56
    array-length v0, p1

    if-ge p0, v0, :cond_0

    return-object p1

    .line 59
    :cond_0
    array-length v0, p1

    :goto_0
    add-int/lit8 v1, p0, 0x1

    if-ge v0, v1, :cond_1

    mul-int/lit8 v0, v0, 0x2

    goto :goto_0

    .line 60
    :cond_1
    new-array p0, v0, [B

    .line 61
    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p1, v1, p0, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p0
.end method

.method public static ۙ(I[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    .line 44
    array-length v0, p1

    if-ge p0, v0, :cond_0

    return-object p1

    .line 47
    :cond_0
    array-length v0, p1

    :goto_0
    add-int/lit8 v1, p0, 0x1

    if-ge v0, v1, :cond_1

    mul-int/lit8 v0, v0, 0x2

    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    .line 50
    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p1, v1, p0, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p0
.end method

.method public static ᩷(III)V
    .locals 4

    const-string v0, ") is negative"

    if-ltz p1, :cond_2

    if-ltz p2, :cond_1

    sub-int v0, p0, p1

    if-gt p2, v0, :cond_0

    return-void

    .line 105
    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Last index ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-long v2, p1

    int-to-long p1, p2

    add-long/2addr v2, p1

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ") is greater than array length ("

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 104
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Length ("

    .line 0
    invoke-static {p2, p1, v0}, Ll/ܰ۟ۙ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 104
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 103
    :cond_2
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string p2, "Offset ("

    .line 0
    invoke-static {p1, p2, v0}, Ll/ܰ۟ۙ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 103
    invoke-direct {p0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
