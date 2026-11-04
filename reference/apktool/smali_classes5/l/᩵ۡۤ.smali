.class public final synthetic Ll/᩵ۡۤ;
.super Ljava/lang/Object;
.source "D17I"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# static fields
.field private static final ۖۡۧ:[S


# instance fields
.field public final synthetic ܰ:Landroid/widget/CheckBox;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩵ۡۤ;->ۖۡۧ:[S

    return-void

    :array_0
    .array-data 2
        0x1956s
        0x7370s
        0x7377s
        0x7373s
        0x737cs
        0x737as
        0x736ds
        0x7346s
        0x7375s
        0x7376s
        0x737es
        0x7346s
        0x7369s
        0x7378s
        0x736ds
        0x7371s
    .end array-data
.end method

.method public synthetic constructor <init>(Landroid/widget/CheckBox;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ۡۤ;->ܰ:Landroid/widget/CheckBox;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 13

    const/4 p1, 0x0

    const/4 p2, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, 0xf48190

    sget v8, Ll/ۗܰ;->ܶۜ۬:I

    sget v9, Ll/ۘܶ;->ܶ᩵ۢ:I

    const-string v10, "\u06e4\u1a75"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x31

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x3fdb

    const v12, 0x3b6ac37f

    xor-int/2addr v11, v12

    const v12, -0x145eef0d

    :goto_0
    xor-int/2addr v10, v12

    xor-int/2addr v7, v8

    mul-int/lit16 v7, v7, -0x537f

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    .line 596
    iget-object p1, p0, Ll/᩵ۡۤ;->ܰ:Landroid/widget/CheckBox;

    invoke-static {p1, v0}, Ll/֨᩻;->ܽ۟ܳ(Ljava/lang/Object;Z)V

    return-void

    .line 477
    :sswitch_0
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    sget v10, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v10, :cond_b

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    sget v10, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v10, :cond_2

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    sget v10, Ll/ۖ֡;->ۚۛᩳ:I

    if-lez v10, :cond_6

    goto/16 :goto_3

    .line 249
    :sswitch_3
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    goto/16 :goto_3

    .line 266
    :sswitch_4
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    return-void

    .line 595
    :sswitch_5
    invoke-interface {p1, p2}, Ll/ᩳ֫ܺ;->remove(Ljava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ;->ۤۡۖ(Ljava/lang/Object;)V

    const/4 v0, 0x0

    sget v10, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v10, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v10, "\u06d7\u06e8"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x6d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x24e5

    const v12, -0x57802383

    xor-int/2addr v11, v12

    const v12, -0x3e141e22

    goto :goto_0

    :sswitch_6
    const/16 p2, 0xf

    invoke-static {v5, v6, p2, v4}, Ll/ۗ᩸;->۫ᩳۡ([SIII)Ljava/lang/String;

    move-result-object p2

    .line 399
    sget v10, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v10, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v10, "\u1a7a\u06da"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x236b

    const v12, -0x4a251664

    xor-int/2addr v11, v12

    const v12, 0xa8bfe3f

    goto :goto_0

    :sswitch_7
    const/4 v6, 0x1

    .line 326
    sget v10, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v10, :cond_3

    :cond_2
    const-string v10, "\u06ec\u1a74"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x6d

    xor-int v11, v10, v8

    mul-int/lit8 v11, v11, 0x4f

    const v12, -0x1897e8d3

    xor-int/2addr v11, v12

    const v12, 0x11d6182

    goto/16 :goto_0

    :cond_3
    const-string v10, "\u06d6\u06eb"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6cb7

    const v12, -0x17026744

    xor-int/2addr v11, v12

    const v12, -0x30e4b7b9

    goto/16 :goto_0

    .line 595
    :sswitch_8
    sget-object p1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-static {p1}, Ll/ۗܶ;->ܿ᩺ܿ(Ljava/lang/Object;)Ll/ᩳ֫ܺ;

    move-result-object p1

    sget-object v5, Ll/᩵ۡۤ;->ۖۡۧ:[S

    .line 273
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v10

    if-gtz v10, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v10, "\u06d8\u06d6"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x41

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6f7b

    const v12, 0x6bebfc1d

    xor-int/2addr v11, v12

    const v12, -0x101a23ea

    goto/16 :goto_0

    :sswitch_9
    const v4, 0xf7f8

    goto :goto_1

    :sswitch_a
    const/16 v4, 0x7319

    :goto_1
    const-string v10, "\u073f\u05ab"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x7b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0xd39

    const v12, -0x39011989

    xor-int/2addr v11, v12

    const v12, 0x2fdb6dc

    goto/16 :goto_0

    :sswitch_b
    mul-int/lit16 v10, v2, 0xa0c

    sub-int/2addr v10, v3

    if-lez v10, :cond_5

    const-string v10, "\u05ab\u06da"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x4c89

    const v12, -0x657c8cf8

    xor-int/2addr v11, v12

    const v12, 0x12606beb

    goto/16 :goto_0

    :cond_5
    const-string v10, "\u06dc\u06ec"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x29

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x675

    const v12, -0x5e3fe547

    xor-int/2addr v11, v12

    const v12, -0x338bd486    # -6.4007656E7f

    goto/16 :goto_0

    :sswitch_c
    mul-int v3, v2, v2

    const v10, 0x193c24

    add-int/2addr v3, v10

    .line 85
    sget v10, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v10, :cond_7

    :cond_6
    :goto_2
    const-string v10, "\u06df\u06ec"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x2e81

    const v12, -0x66eac2b9

    xor-int/2addr v11, v12

    const v12, -0x70bb258b

    goto/16 :goto_0

    :cond_7
    const-string v10, "\u05ab\u0733"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x3b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x2c33

    const v12, -0x6e2790e3

    xor-int/2addr v11, v12

    const v12, -0x60f1b97

    goto/16 :goto_0

    :sswitch_d
    const/4 v2, 0x0

    aget-short v2, v1, v2

    .line 407
    sget v10, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v10, :cond_8

    goto/16 :goto_5

    :cond_8
    const-string v10, "\u1a79\u1a7a"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x7b

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x59cb

    const v12, 0x379dbd25

    xor-int/2addr v11, v12

    const v12, 0x29a30902

    goto/16 :goto_0

    :sswitch_e
    sget-object v1, Ll/᩵ۡۤ;->ۖۡۧ:[S

    .line 70
    sget v10, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v10, :cond_9

    goto :goto_3

    :cond_9
    const-string v10, "\u1a76\u1a74"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x64a9

    const v12, -0x6e24d773

    xor-int/2addr v11, v12

    const v12, 0x7965af8f

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v10

    if-nez v10, :cond_a

    :goto_3
    const-string v10, "\u06e7\u06e7"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x6f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x7909

    const v12, -0x32740099

    xor-int/2addr v11, v12

    const v12, -0x316dd15f

    goto/16 :goto_0

    :cond_a
    const-string v10, "\u073a\u0730"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x3ad9

    const v12, -0x568bcbec

    xor-int/2addr v11, v12

    const v12, 0x7624fa28

    goto/16 :goto_0

    :sswitch_10
    sget v10, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v10, :cond_c

    :cond_b
    :goto_4
    const-string v10, "\u06eb\u0733"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x10f5

    const v12, -0x6635c948

    xor-int/2addr v11, v12

    const v12, 0x8ee48bb

    goto/16 :goto_0

    :cond_c
    const-string v10, "\u1a7a\u06e8"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x4b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0xd37

    const v12, -0x1eba59cc

    xor-int/2addr v11, v12

    const v12, 0x1dfb8090

    goto/16 :goto_0

    .line 196
    :sswitch_11
    sget v10, Ll/ۧ;->ۨۗܰ:I

    if-ltz v10, :cond_d

    :goto_5
    const-string v10, "\u06e4\u0730"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x110d

    const v12, 0x3055159a

    xor-int/2addr v11, v12

    const v12, -0x6eca1953

    goto/16 :goto_0

    :cond_d
    const-string v10, "\u05ab\u06e7"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1c35

    const v12, -0x4ddc98dc

    xor-int/2addr v11, v12

    const v12, 0x5eb1e2ff

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x700bfdbb -> :sswitch_9
        -0x6aa51993 -> :sswitch_f
        -0x61925e48 -> :sswitch_e
        -0x5b281fb3 -> :sswitch_9
        -0x596b3f98 -> :sswitch_4
        -0x4f8a681b -> :sswitch_c
        -0x49a241a2 -> :sswitch_1
        -0x4907173b -> :sswitch_10
        -0x43c0074a -> :sswitch_5
        -0x3499f50d -> :sswitch_8
        -0x302e23e8 -> :sswitch_d
        -0x2efd372c -> :sswitch_f
        -0x268ff3c0 -> :sswitch_a
        -0x1ff3697d -> :sswitch_e
        -0x1f58d64b -> :sswitch_1
        -0x1a422eee -> :sswitch_b
        -0x18948456 -> :sswitch_11
        -0x15155cb6 -> :sswitch_7
        -0x12e1b8eb -> :sswitch_11
        -0x10fccd0a -> :sswitch_b
        -0x8be98ba -> :sswitch_4
        -0x3b7a89a -> :sswitch_c
        -0x27d804 -> :sswitch_a
        0x60d0c22 -> :sswitch_6
        0x27522e34 -> :sswitch_6
        0x27820748 -> :sswitch_0
        0x32a37471 -> :sswitch_2
        0x34a62267 -> :sswitch_2
        0x3c51ff05 -> :sswitch_8
        0x40a6099e -> :sswitch_7
        0x5f34c24b -> :sswitch_0
        0x670dbd3e -> :sswitch_3
        0x6c71a71b -> :sswitch_3
        0x6d642f8f -> :sswitch_5
        0x7b89e032 -> :sswitch_d
        0x7c7cf50e -> :sswitch_10
    .end sparse-switch
.end method
