.class public final Ll/ۘܺ᩵;
.super Ljava/lang/Object;
.source "6IUK"


# instance fields
.field public ۙ:[I

.field public ۚ:Ljava/util/ArrayList;

.field public final ۤ:I

.field public final ۫:[Ll/ܰܺ᩵;

.field public ܳ:Ljava/util/HashMap;

.field public final ᩴ:Ll/ۨܺ᩵;

.field public ᩷:Ljava/util/List;

.field public final ᩸:Ll/ۨܺ᩵;


# direct methods
.method public constructor <init>(Ll/ۨܺ᩵;II)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Ll/ۘܺ᩵;->ᩴ:Ll/ۨܺ᩵;

    .line 51
    invoke-virtual {p1}, Ll/ۨܺ᩵;->ۙ()Ll/ۨܺ᩵;

    move-result-object p1

    iput-object p1, p0, Ll/ۘܺ᩵;->᩸:Ll/ۨܺ᩵;

    .line 52
    new-array p1, p2, [Ll/ܰܺ᩵;

    iput-object p1, p0, Ll/ۘܺ᩵;->۫:[Ll/ܰܺ᩵;

    .line 53
    iput p3, p0, Ll/ۘܺ᩵;->ۤ:I

    return-void
.end method

.method private ۙ(Ll/ܰܺ᩵;I)V
    .locals 4

    .line 202
    invoke-virtual {p1}, Ll/ܰܺ᩵;->ۤ()I

    move-result v0

    .line 203
    iget-object v1, p0, Ll/ۘܺ᩵;->۫:[Ll/ܰܺ᩵;

    aget-object v2, v1, v0

    if-eqz v2, :cond_0

    .line 212
    invoke-virtual {v2, p2}, Ll/ܰܺ᩵;->ۙ(I)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 213
    iget-object v3, p0, Ll/ۘܺ᩵;->ۚ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    :cond_0
    invoke-virtual {p1, p2}, Ll/ܰܺ᩵;->᩷(I)V

    .line 208
    aput-object p1, v1, v0

    return-void
.end method


# virtual methods
.method public final ۙ(I)Ll/ᩳ᩶ۗ;
    .locals 21

    move-object/from16 v0, p0

    .line 84
    iget-object v1, v0, Ll/ۘܺ᩵;->ᩴ:Ll/ۨܺ᩵;

    move/from16 v2, p1

    invoke-virtual {v1, v2}, Ll/ۨܺ᩵;->ۙ(I)V

    .line 87
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Ll/ۘܺ᩵;->ۚ:Ljava/util/ArrayList;

    .line 88
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v0, Ll/ۘܺ᩵;->ܳ:Ljava/util/HashMap;

    .line 306
    invoke-static {v1}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v2

    invoke-static {v1}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v3

    .line 93
    iget-object v4, v0, Ll/ۘܺ᩵;->᩷:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 95
    :goto_0
    iget-object v8, v0, Ll/ۘܺ᩵;->᩸:Ll/ۨܺ᩵;

    if-ge v6, v3, :cond_1

    .line 310
    invoke-static {v1}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    .line 97
    invoke-virtual {v8, v9}, Ll/ۨܺ᩵;->ܳ(I)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_0

    if-ge v6, v4, :cond_0

    .line 99
    new-instance v7, Ll/ܰܺ᩵;

    iget-object v9, v0, Ll/ۘܺ᩵;->ۙ:[I

    aget v9, v9, v6

    iget-object v10, v0, Ll/ۘܺ᩵;->᩷:Ljava/util/List;

    invoke-interface {v10, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    const/4 v11, 0x0

    .line 27
    invoke-direct {v7, v8, v9, v10, v11}, Ll/ܰܺ᩵;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 100
    invoke-direct {v0, v7, v5}, Ll/ۘܺ᩵;->ۙ(Ll/ܰܺ᩵;I)V

    .line 101
    invoke-virtual {v7}, Ll/ܰܺ᩵;->ᩴ()V

    const/4 v7, 0x1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 106
    :goto_1
    :pswitch_0
    invoke-virtual {v1}, Ll/ۨܺ᩵;->ܽ()I

    move-result v4

    .line 107
    iget v6, v0, Ll/ۘܺ᩵;->ۤ:I

    iget-object v9, v0, Ll/ۘܺ᩵;->۫:[Ll/ܰܺ᩵;

    if-nez v4, :cond_4

    if-eqz v7, :cond_3

    .line 175
    array-length v1, v9

    :goto_2
    if-ge v5, v1, :cond_3

    aget-object v2, v9, v5

    if-eqz v2, :cond_2

    .line 176
    invoke-virtual {v2}, Ll/ܰܺ᩵;->᩸()Z

    move-result v3

    if-nez v3, :cond_2

    add-int/lit8 v3, v6, -0x1

    .line 212
    invoke-virtual {v2, v3}, Ll/ܰܺ᩵;->ۙ(I)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 213
    iget-object v3, v0, Ll/ۘܺ᩵;->ۚ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 181
    :cond_3
    new-instance v1, Ll/ᩳ᩶ۗ;

    iget-object v2, v0, Ll/ۘܺ᩵;->ܳ:Ljava/util/HashMap;

    iget-object v3, v0, Ll/ۘܺ᩵;->ۚ:Ljava/util/ArrayList;

    invoke-direct {v1, v2, v3}, Ll/ᩳ᩶ۗ;-><init>(Ljava/util/HashMap;Ljava/util/ArrayList;)V

    return-object v1

    :cond_4
    packed-switch v4, :pswitch_data_0

    add-int/lit8 v4, v4, -0xa

    .line 166
    div-int/lit8 v9, v4, 0xf

    add-int/2addr v9, v3

    add-int/lit8 v6, v6, -0x1

    .line 185
    invoke-static {v9, v6}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 168
    rem-int/lit8 v4, v4, 0xf

    add-int/lit8 v4, v4, -0x4

    add-int/2addr v4, v2

    .line 189
    iget-object v2, v0, Ll/ۘܺ᩵;->ܳ:Ljava/util/HashMap;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v2, v6, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_4

    .line 306
    :pswitch_1
    invoke-static {v1}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    .line 161
    invoke-virtual {v8, v4}, Ll/ۨܺ᩵;->ܳ(I)Ljava/lang/String;

    goto :goto_1

    .line 306
    :pswitch_2
    invoke-static {v1}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v4

    .line 193
    aget-object v6, v9, v4

    if-eqz v6, :cond_6

    .line 212
    invoke-virtual {v6, v3}, Ll/ܰܺ᩵;->ۙ(I)Z

    move-result v7

    if-eqz v7, :cond_5

    .line 213
    iget-object v7, v0, Ll/ۘܺ᩵;->ۚ:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    :cond_5
    new-instance v7, Ll/ܰܺ᩵;

    invoke-virtual {v6}, Ll/ܰܺ᩵;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6}, Ll/ܰܺ᩵;->getType()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6}, Ll/ܰܺ᩵;->getSignature()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v7, v9, v4, v10, v6}, Ll/ܰܺ᩵;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 197
    invoke-direct {v0, v7, v3}, Ll/ۘܺ᩵;->ۙ(Ll/ܰܺ᩵;I)V

    goto :goto_3

    .line 306
    :pswitch_3
    invoke-static {v1}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v4

    .line 147
    aget-object v4, v9, v4

    if-eqz v4, :cond_6

    .line 212
    invoke-virtual {v4, v3}, Ll/ܰܺ᩵;->ۙ(I)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 213
    iget-object v6, v0, Ll/ۘܺ᩵;->ۚ:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 306
    :pswitch_4
    invoke-static {v1}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v11

    .line 310
    invoke-static {v1}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v4

    add-int/lit8 v12, v4, -0x1

    invoke-static {v1}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v4

    add-int/lit8 v13, v4, -0x1

    invoke-static {v1}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v4

    add-int/lit8 v14, v4, -0x1

    .line 134
    new-instance v4, Ll/ܰܺ᩵;

    iget-object v10, v0, Ll/ۘܺ᩵;->᩸:Ll/ۨܺ᩵;

    move-object v9, v4

    invoke-direct/range {v9 .. v14}, Ll/ܰܺ᩵;-><init>(Ll/ۨܺ᩵;IIII)V

    .line 135
    invoke-direct {v0, v4, v3}, Ll/ۘܺ᩵;->ۙ(Ll/ܰܺ᩵;I)V

    goto :goto_3

    .line 306
    :pswitch_5
    invoke-static {v1}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v17

    invoke-static {v1}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v4

    add-int/lit8 v18, v4, -0x1

    invoke-static {v1}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v4

    add-int/lit8 v19, v4, -0x1

    .line 124
    new-instance v4, Ll/ܰܺ᩵;

    iget-object v6, v0, Ll/ۘܺ᩵;->᩸:Ll/ۨܺ᩵;

    const/16 v20, -0x1

    move-object v15, v4

    move-object/from16 v16, v6

    invoke-direct/range {v15 .. v20}, Ll/ܰܺ᩵;-><init>(Ll/ۨܺ᩵;IIII)V

    .line 125
    invoke-direct {v0, v4, v3}, Ll/ۘܺ᩵;->ۙ(Ll/ܰܺ᩵;I)V

    :cond_6
    :goto_3
    const/4 v7, 0x1

    goto/16 :goto_1

    .line 117
    :pswitch_6
    invoke-virtual {v1}, Ll/ۨܺ᩵;->᩻()I

    move-result v4

    add-int/2addr v4, v2

    :goto_4
    move v2, v4

    goto/16 :goto_1

    .line 306
    :pswitch_7
    invoke-static {v1}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v4

    add-int/2addr v4, v3

    add-int/lit8 v6, v6, -0x1

    .line 185
    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    move-result v3

    goto/16 :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final ۙ(ILjava/util/List;)V
    .locals 4

    .line 57
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 58
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/ۘܺ᩵;->᩷:Ljava/util/List;

    return-void

    .line 62
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    .line 63
    new-array v1, v0, [I

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_2

    .line 66
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x0

    .line 74
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x44

    if-eq v2, v3, :cond_1

    const/16 v3, 0x4a

    if-eq v2, v3, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x2

    :goto_1
    sub-int/2addr p1, v2

    .line 67
    aput p1, v1, v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 69
    :cond_2
    iput-object v1, p0, Ll/ۘܺ᩵;->ۙ:[I

    .line 70
    iput-object p2, p0, Ll/ۘܺ᩵;->᩷:Ljava/util/List;

    return-void
.end method
