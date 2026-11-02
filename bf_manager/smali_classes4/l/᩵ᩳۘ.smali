.class public final synthetic Ll/᩵ᩳۘ;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ܺ:Ljava/text/Collator;


# direct methods
.method public synthetic constructor <init>(Ljava/text/Collator;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ᩳۘ;->ܺ:Ljava/text/Collator;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, -0xb9451d

    sget v5, Ll/֨ۢ;->ۢ۬ۧ:I

    sget v6, Ll/ۖۧ;->ܺۚۖ:I

    const-string v7, "\u05ab\u0730"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x1907

    const v9, -0x304887fb

    xor-int/2addr v8, v9

    const v9, 0x6a8aade5

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v6

    mul-int/lit16 v4, v4, 0x269f

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v7

    if-nez v7, :cond_c

    goto/16 :goto_3

    .line 576
    :sswitch_0
    sget v7, Ll/֡ۚ;->ۢܰ᩸:I

    if-gez v7, :cond_3

    goto/16 :goto_2

    .line 1228
    :sswitch_1
    sget v7, Ll/ۗ۬;->ۤᩴ᩻:I

    if-gez v7, :cond_b

    goto/16 :goto_2

    .line 745
    :sswitch_2
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v7

    if-lez v7, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v7, "\u0736\u1a79"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x47

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x5885

    const v9, 0x48432fc1

    xor-int/2addr v8, v9

    const v9, 0x29d1fd2c

    goto :goto_0

    .line 1934
    :sswitch_3
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    goto/16 :goto_2

    .line 1725
    :sswitch_4
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    const/4 p1, 0x0

    return p1

    .line 2271
    :sswitch_5
    iget-object p1, p0, Ll/᩵ᩳۘ;->ܺ:Ljava/text/Collator;

    invoke-virtual {p1, v2, v3}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1

    .line 6
    :sswitch_6
    sget v2, Ll/ۙ۠ۘ;->᩻ܰ:I

    .line 2271
    invoke-virtual {v0}, Ll/ܽᩴۘ;->ۙ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ll/ܽᩴۘ;->ۙ()Ljava/lang/String;

    move-result-object v3

    sget v7, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v7, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v7, "\u06df\u073a"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x51

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x4a77

    const v9, 0x6b5da0a7

    xor-int/2addr v8, v9

    const v9, 0x2d449e1b

    goto :goto_0

    .line 2
    :sswitch_7
    move-object v0, p1

    check-cast v0, Ll/ܽᩴۘ;

    .line 4
    move-object v1, p2

    check-cast v1, Ll/ܽᩴۘ;

    .line 140
    sget v7, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v7, :cond_2

    goto/16 :goto_1

    :cond_2
    const-string v7, "\u1a78\u06df"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x27

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x3ef5

    const v9, -0x1acf323f

    xor-int/2addr v8, v9

    const v9, -0x7639ba74

    goto/16 :goto_0

    .line 840
    :sswitch_8
    sget v7, Ll/۟;->ۨᩴۛ:I

    if-ltz v7, :cond_4

    :cond_3
    const-string v7, "\u06da\u06e1"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x1175

    const v9, 0x561f0bfd

    xor-int/2addr v8, v9

    const v9, 0x2caf6534

    goto/16 :goto_0

    :cond_4
    const-string v7, "\u05a8\u05ab"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x5363

    const v9, -0x113f305b

    xor-int/2addr v8, v9

    const v9, 0x2dcd9f3c

    goto/16 :goto_0

    .line 678
    :sswitch_9
    sget v7, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v7, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v7, "\u073f\u1a76"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x65

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6b23

    const v9, -0x88c2d8d

    xor-int/2addr v8, v9

    const v9, -0x5cda07bc

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v7, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v7, :cond_6

    goto :goto_1

    :cond_6
    const-string v7, "\u06eb\u073f"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x1e63

    const v9, -0x2594b763

    xor-int/2addr v8, v9

    const v9, -0x4883f963

    goto/16 :goto_0

    .line 516
    :sswitch_b
    sget-boolean v7, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v7, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v7, "\u06d8\u06da"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x7d77

    const v9, -0x3ed15afa

    xor-int/2addr v8, v9

    const v9, -0x208083e4

    goto/16 :goto_0

    .line 829
    :sswitch_c
    sget v7, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v7, :cond_8

    goto :goto_3

    :cond_8
    const-string v7, "\u06e0\u06ec"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x4f

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x6fef

    const v9, -0x27ae9138

    xor-int/2addr v8, v9

    const v9, -0x3737097

    goto/16 :goto_0

    :sswitch_d
    sget v7, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v7, :cond_9

    :goto_1
    const-string v7, "\u1a73\u06df"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x3d

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x25d5

    const v9, -0x7c31958

    xor-int/2addr v8, v9

    const v9, 0x384f6c80

    goto/16 :goto_0

    :cond_9
    const-string v7, "\u073f\u06dc"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x34bb

    const v9, -0x38ade19f

    xor-int/2addr v8, v9

    const v9, -0x72d7a15f

    goto/16 :goto_0

    .line 32
    :sswitch_e
    sget v7, Ll/ۗ;->֨۬ۖ:I

    if-ltz v7, :cond_a

    :goto_2
    const-string v7, "\u1a79\u1a77"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0xa47

    const v9, 0x4d9807cd    # 3.18831E8f

    xor-int/2addr v8, v9

    const v9, 0x60305968

    goto/16 :goto_0

    :cond_a
    const-string v7, "\u06db\u1a74"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x63

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x797

    const v9, 0x442f9f0f

    xor-int/2addr v8, v9

    const v9, -0x18f4fa67

    goto/16 :goto_0

    :cond_b
    :goto_3
    const-string v7, "\u1a79\u05ab"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x49

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x60c7

    const v9, 0x344b6647

    xor-int/2addr v8, v9

    const v9, -0x9b4b1bb

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u06e4\u06e7"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x6f

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x33c7

    const v9, -0xcb6d91c

    xor-int/2addr v8, v9

    const v9, 0x2ebe51f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7bc33a2e -> :sswitch_0
        -0x7badeb61 -> :sswitch_c
        -0x645d0304 -> :sswitch_b
        -0x64237319 -> :sswitch_3
        -0x537e4459 -> :sswitch_d
        -0x50b15e10 -> :sswitch_a
        -0x4a9669e8 -> :sswitch_d
        -0x44e8668d -> :sswitch_7
        -0x41c932b3 -> :sswitch_a
        -0x37351848 -> :sswitch_3
        -0x16c04825 -> :sswitch_0
        -0xb881ad4 -> :sswitch_4
        -0x2e640ce -> :sswitch_c
        -0x2832110 -> :sswitch_7
        0x926e1df -> :sswitch_5
        0x10021098 -> :sswitch_4
        0x141e6564 -> :sswitch_2
        0x1f60cc43 -> :sswitch_8
        0x25e51298 -> :sswitch_8
        0x282cfd02 -> :sswitch_1
        0x425c1db6 -> :sswitch_6
        0x436a376b -> :sswitch_6
        0x4db6b624 -> :sswitch_e
        0x5282a37e -> :sswitch_5
        0x557c441a -> :sswitch_9
        0x5889afa2 -> :sswitch_e
        0x5c9eb89d -> :sswitch_1
        0x67cd2fe6 -> :sswitch_9
        0x75e13e2c -> :sswitch_2
        0x79bc90e1 -> :sswitch_b
    .end sparse-switch
.end method
