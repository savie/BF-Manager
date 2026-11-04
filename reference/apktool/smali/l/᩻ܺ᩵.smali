.class public final Ll/᩻ܺ᩵;
.super Ljava/lang/Object;
.source "86DX"


# instance fields
.field public final ۙ:Ll/ۨܺ᩵;

.field public ᩷:I


# direct methods
.method public constructor <init>(Ll/ۨܺ᩵;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Ll/᩻ܺ᩵;->ۙ:Ll/ۨܺ᩵;

    return-void
.end method

.method public static ۙ(Ll/ۧ᩻᩵;)V
    .locals 3

    .line 96
    invoke-virtual {p0}, Ll/ۧ᩻᩵;->᩹()Ll/۫ܺ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/۫ܺ᩵;->᩷()Ll/ܳܺ᩵;

    move-result-object v0

    .line 97
    invoke-virtual {p0}, Ll/ۧ᩻᩵;->᩵()I

    move-result v1

    invoke-virtual {p0}, Ll/ۧ᩻᩵;->᩸()Ll/᩻ܺ᩵;

    move-result-object v2

    iget-object v2, v2, Ll/᩻ܺ᩵;->ۙ:Ll/ۨܺ᩵;

    invoke-virtual {v0, p0, v1, v2}, Ll/ܳܺ᩵;->ۙ(Ll/ۧ᩻᩵;ILl/ۨܺ᩵;)V

    const/4 v0, 0x1

    .line 98
    invoke-virtual {p0, v0}, Ll/ۧ᩻᩵;->ۙ(Z)V

    return-void
.end method


# virtual methods
.method public final ۙ()Ll/᩻ܺ᩵;
    .locals 2

    .line 37
    new-instance v0, Ll/᩻ܺ᩵;

    iget-object v1, p0, Ll/᩻ܺ᩵;->ۙ:Ll/ۨܺ᩵;

    invoke-virtual {v1}, Ll/ۨܺ᩵;->ۙ()Ll/ۨܺ᩵;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/᩻ܺ᩵;-><init>(Ll/ۨܺ᩵;)V

    .line 198
    iget v1, p0, Ll/᩻ܺ᩵;->᩷:I

    .line 194
    iput v1, v0, Ll/᩻ܺ᩵;->᩷:I

    return-object v0
.end method

.method public final ۙ(I)V
    .locals 0

    .line 194
    iput p1, p0, Ll/᩻ܺ᩵;->᩷:I

    return-void
.end method

.method public final ۙ(Ljava/util/function/Consumer;)V
    .locals 7

    .line 63
    new-instance v0, Ll/ۧ᩻᩵;

    iget-object v1, p0, Ll/᩻ܺ᩵;->ۙ:Ll/ۨܺ᩵;

    invoke-virtual {v1}, Ll/ۨܺ᩵;->ۙ()Ll/ۨܺ᩵;

    move-result-object v2

    invoke-direct {v0, p0, v2}, Ll/ۧ᩻᩵;-><init>(Ll/᩻ܺ᩵;Ll/ۨܺ᩵;)V

    const/16 v2, 0xc

    .line 64
    invoke-virtual {v1, v2}, Ll/ۨܺ᩵;->ۚ(I)V

    .line 65
    invoke-virtual {v1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    .line 68
    invoke-virtual {v1}, Ll/ۨܺ᩵;->᩷()I

    .line 69
    invoke-virtual {v1}, Ll/ۨܺ᩵;->ܶ()I

    move-result v5

    .line 70
    invoke-static {v5}, Ll/۫ܺ᩵;->ۙ(I)Ll/۫ܺ᩵;

    move-result-object v6

    .line 72
    invoke-virtual {v0, v4}, Ll/ۧ᩻᩵;->ᩴ(I)V

    .line 73
    invoke-virtual {v0, v6}, Ll/ۧ᩻᩵;->ۙ(Ll/۫ܺ᩵;)V

    .line 74
    invoke-virtual {v0, v5}, Ll/ۧ᩻᩵;->ܳ(I)V

    const/4 v5, 0x0

    .line 75
    invoke-virtual {v0, v5}, Ll/ۧ᩻᩵;->ۙ(Ll/ۤܿۗ;)V

    .line 76
    invoke-virtual {v0, v3}, Ll/ۧ᩻᩵;->ۙ(Z)V

    if-eqz v6, :cond_0

    .line 78
    invoke-virtual {v6}, Ll/۫ܺ᩵;->᩷()Ll/ܳܺ᩵;

    move-result-object v5

    .line 79
    invoke-virtual {v5}, Ll/ܳܺ᩵;->᩷()I

    move-result v6

    invoke-virtual {v0, v6}, Ll/ۧ᩻᩵;->۫(I)V

    .line 80
    invoke-virtual {v5}, Ll/ܳܺ᩵;->ۙ()I

    move-result v5

    invoke-virtual {v0, v5}, Ll/ۧ᩻᩵;->᩸(I)V

    goto :goto_1

    .line 82
    :cond_0
    invoke-virtual {v0, v3}, Ll/ۧ᩻᩵;->۫(I)V

    const/4 v5, 0x1

    .line 83
    invoke-virtual {v0, v5}, Ll/ۧ᩻᩵;->᩸(I)V

    .line 86
    :goto_1
    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 88
    invoke-virtual {v0}, Ll/ۧ᩻᩵;->ۨ()Z

    move-result v5

    if-nez v5, :cond_1

    .line 102
    invoke-virtual {v0}, Ll/ۧ᩻᩵;->᩹()Ll/۫ܺ᩵;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 104
    invoke-virtual {v0}, Ll/ۧ᩻᩵;->᩸()Ll/᩻ܺ᩵;

    move-result-object v6

    .line 105
    invoke-virtual {v5}, Ll/۫ܺ᩵;->᩷()Ll/ܳܺ᩵;

    move-result-object v5

    iget-object v6, v6, Ll/᩻ܺ᩵;->ۙ:Ll/ۨܺ᩵;

    invoke-virtual {v5, v0, v6}, Ll/ܳܺ᩵;->ۙ(Ll/ۧ᩻᩵;Ll/ۨܺ᩵;)V

    .line 91
    :cond_1
    invoke-virtual {v0}, Ll/ۧ᩻᩵;->ۗ()I

    move-result v5

    add-int/2addr v4, v5

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ۤ()I
    .locals 2

    const/4 v0, 0x0

    .line 48
    iget-object v1, p0, Ll/᩻ܺ᩵;->ۙ:Ll/ۨܺ᩵;

    invoke-virtual {v1, v0}, Ll/ۨܺ᩵;->ۚ(I)V

    invoke-virtual {v1}, Ll/ۨܺ᩵;->ܶ()I

    move-result v0

    return v0
.end method

.method public final ᩴ()I
    .locals 2

    const/16 v0, 0xc

    .line 58
    iget-object v1, p0, Ll/᩻ܺ᩵;->ۙ:Ll/ۨܺ᩵;

    invoke-virtual {v1, v0}, Ll/ۨܺ᩵;->ۚ(I)V

    invoke-virtual {v1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v0

    return v0
.end method

.method public final ᩷()Ll/ᩳ᩶ۗ;
    .locals 5

    const/16 v0, 0x8

    .line 112
    iget-object v1, p0, Ll/᩻ܺ᩵;->ۙ:Ll/ۨܺ᩵;

    invoke-virtual {v1, v0}, Ll/ۨܺ᩵;->ۚ(I)V

    invoke-virtual {v1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    if-ltz v0, :cond_1

    .line 116
    invoke-virtual {v1}, Ll/ۨܺ᩵;->ۗ()I

    move-result v2

    if-gt v0, v2, :cond_1

    .line 119
    invoke-virtual {p0}, Ll/᩻ܺ᩵;->ۤ()I

    move-result v2

    .line 120
    new-instance v3, Ll/ۘܺ᩵;

    invoke-virtual {p0}, Ll/᩻ܺ᩵;->ᩴ()I

    move-result v4

    invoke-direct {v3, v1, v2, v4}, Ll/ۘܺ᩵;-><init>(Ll/ۨܺ᩵;II)V

    .line 121
    iget v4, p0, Ll/᩻ܺ᩵;->᩷:I

    invoke-virtual {v1, v4}, Ll/ۨܺ᩵;->᩸(I)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v3, v2, v1}, Ll/ۘܺ᩵;->ۙ(ILjava/util/List;)V

    .line 122
    invoke-virtual {v3, v0}, Ll/ۘܺ᩵;->ۙ(I)Ll/ᩳ᩶ۗ;

    move-result-object v0

    return-object v0

    .line 117
    :cond_1
    new-instance v0, Ll/ۢۧ᩵;

    const-string v1, "Invalid debug info offset"

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 117
    throw v0
.end method

.method public final ᩷(I)V
    .locals 1

    .line 43
    iget-object v0, p0, Ll/᩻ܺ᩵;->ۙ:Ll/ۨܺ᩵;

    invoke-virtual {v0, p1}, Ll/ۨܺ᩵;->ۧ(I)V

    return-void
.end method

.method public final ᩸()Ljava/util/List;
    .locals 15

    .line 126
    iget-object v0, p0, Ll/᩻ܺ᩵;->ۙ:Ll/ۨܺ᩵;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Ll/ۨܺ᩵;->ۚ(I)V

    invoke-virtual {v0}, Ll/ۨܺ᩵;->ܶ()I

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x1

    if-nez v2, :cond_0

    const/4 v2, -0x1

    goto :goto_1

    .line 134
    :cond_0
    invoke-virtual {p0}, Ll/᩻ܺ᩵;->ᩴ()I

    move-result v2

    .line 135
    rem-int/lit8 v5, v2, 0x2

    const/4 v6, 0x2

    if-ne v5, v4, :cond_1

    const/4 v4, 0x2

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    const/16 v5, 0x10

    .line 136
    invoke-static {v2, v6, v5, v4}, Ll/ۨ᩹ۧ;->ۙ(IIII)I

    move-result v2

    :goto_1
    if-ne v2, v3, :cond_2

    .line 143
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 126
    :cond_2
    invoke-virtual {v0, v1}, Ll/ۨܺ᩵;->ۚ(I)V

    invoke-virtual {v0}, Ll/ۨܺ᩵;->ܶ()I

    move-result v1

    mul-int/lit8 v3, v1, 0x8

    add-int/2addr v3, v2

    .line 146
    invoke-virtual {v0}, Ll/ۨܺ᩵;->ۙ()Ll/ۨܺ᩵;

    move-result-object v4

    .line 163
    invoke-virtual {v0, v3}, Ll/ۨܺ᩵;->ۚ(I)V

    .line 164
    invoke-virtual {v0}, Ll/ۨܺ᩵;->᩷()I

    move-result v3

    .line 306
    invoke-static {v0}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v5

    .line 166
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6, v5}, Ljava/util/HashMap;-><init>(I)V

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v5, :cond_5

    .line 168
    invoke-virtual {v0}, Ll/ۨܺ᩵;->᩷()I

    move-result v8

    sub-int/2addr v8, v3

    .line 169
    invoke-virtual {v0}, Ll/ۨܺ᩵;->᩻()I

    move-result v9

    .line 170
    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v10

    .line 171
    new-array v11, v10, [I

    .line 172
    new-array v12, v10, [Ljava/lang/String;

    const/4 v13, 0x0

    :goto_3
    if-ge v13, v10, :cond_3

    .line 306
    invoke-static {v0}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v14

    .line 174
    invoke-virtual {v4, v14}, Ll/ۨܺ᩵;->۫(I)Ljava/lang/String;

    move-result-object v14

    aput-object v14, v12, v13

    .line 306
    invoke-static {v0}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v14

    .line 175
    aput v14, v11, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_3

    :cond_3
    if-gtz v9, :cond_4

    .line 306
    invoke-static {v0}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v9

    goto :goto_4

    :cond_4
    const/4 v9, -0x1

    .line 183
    :goto_4
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    new-instance v10, Ll/۟᩶ۗ;

    invoke-direct {v10, v9, v12, v11}, Ll/۟᩶ۗ;-><init>(I[Ljava/lang/String;[I)V

    invoke-virtual {v6, v8, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 147
    :cond_5
    invoke-virtual {v0, v2}, Ll/ۨܺ᩵;->ۚ(I)V

    .line 148
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    :goto_5
    if-ge v3, v1, :cond_7

    .line 150
    invoke-virtual {v0}, Ll/ۨܺ᩵;->ۚ()I

    move-result v4

    .line 151
    invoke-virtual {v0}, Ll/ۨܺ᩵;->ܶ()I

    move-result v5

    .line 152
    invoke-virtual {v0}, Ll/ۨܺ᩵;->ܶ()I

    move-result v7

    .line 153
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ᩳܰۗ;

    if-eqz v8, :cond_6

    .line 157
    new-instance v7, Ll/۠᩶ۗ;

    add-int/2addr v5, v4

    add-int/lit8 v5, v5, -0x1

    invoke-direct {v7, v4, v5, v8}, Ll/۠᩶ۗ;-><init>(IILl/ᩳܰۗ;)V

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    .line 155
    :cond_6
    new-instance v0, Ll/۬ۧ᩵;

    const-string v1, "Catch handler not found by byte offset: "

    .line 0
    invoke-static {v7, v1}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 155
    throw v0

    :cond_7
    return-object v2
.end method
