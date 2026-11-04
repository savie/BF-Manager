.class public Ll/ۤۛ֫;
.super Ll/ܽ֡֫;
.source "O3YD"


# static fields
.field private static final ۬ۛ֡:[S

.field public static final synthetic ܽ᩷:I


# instance fields
.field public ֫᩷:Lbin/mt/plugin/api/preference/PluginPreference;

.field public ۚ᩷:Ljava/util/ArrayList;

.field public ۧ᩷:Ll/᩷ۛ֫;

.field public ۫᩷:Landroid/content/SharedPreferences;

.field public ܳ᩷:Lbin/mt/plugin/api/PluginContext;

.field public ܺ᩷:Ljava/util/ArrayList;

.field public ᩴ᩷:Ll/ۨ᩺֫;

.field public ᩸᩷:Ll/ۢۨ֫;

.field public ᩻᩷:Ll/ۚܿ᩻;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x6e

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۤۛ֫;->۬ۛ֡:[S

    return-void

    :array_0
    .array-data 2
        0x1ae6s
        -0x1f03s
        -0x1f26s
        -0x1f39s
        -0x1f40s
        -0x1f2bs
        -0x1f26s
        -0x1f29s
        -0x1f2fs
        -0x1f6cs
        -0x1f27s
        -0x1f2bs
        -0x1f23s
        -0x1f26s
        -0x1f6cs
        -0x1f3cs
        -0x1f3as
        -0x1f2fs
        -0x1f2es
        -0x1f2fs
        -0x1f3as
        -0x1f2fs
        -0x1f26s
        -0x1f29s
        -0x1f2fs
        -0x1f6cs
        -0x1f2es
        -0x1f2bs
        -0x1f23s
        -0x1f28s
        -0x1f2fs
        -0x1f30s
        0x7e5cs
        -0x51ees
        0x7aces
        0x21b5s
        0x18ees
        -0xf1bs
        -0x1128s
        0x4c2s
        -0xa0es
        0x35bds
        -0x14aas
        0x1380s
        -0x1d51s
        0x605fs
        0x6043s
        0x605as
        0x6048s
        0x6046s
        0x6041s
        0x6066s
        0x604bs
        0x607fs
        0x6043s
        0x605as
        0x6048s
        0x6046s
        0x6041s
        0x600fs
        0x6041s
        0x6040s
        0x605bs
        0x600fs
        0x6049s
        0x6040s
        0x605as
        0x6041s
        0x604bs
        0x6015s
        0x600fs
        0x605fs
        0x6043s
        0x605as
        0x6048s
        0x6046s
        0x6041s
        0x607fs
        0x605ds
        0x604as
        0x6049s
        0x604as
        0x605ds
        0x604as
        0x6041s
        0x604cs
        0x604as
        0x606ds
        0x605as
        0x6046s
        0x6043s
        0x604bs
        0x600fs
        0x605fs
        0x605ds
        0x604as
        0x6049s
        0x604as
        0x605ds
        0x604as
        0x6041s
        0x604cs
        0x604as
        0x600fs
        0x6049s
        0x604es
        0x6046s
        0x6043s
        0x604as
        0x604bs
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 58
    invoke-direct {p0}, Ll/ܽ֡֫;-><init>()V

    .line 59
    invoke-virtual {p0}, Ll/ܽ֡֫;->ۘ()V

    return-void
.end method

.method public static ֫(Ll/ۤۛ֫;)V
    .locals 0

    .line 161
    invoke-direct {p0}, Ll/ۤۛ֫;->᩷ۙ()V

    .line 162
    iget-object p0, p0, Ll/ۤۛ֫;->᩸᩷:Ll/ۢۨ֫;

    invoke-static {p0}, Ll/ۗ֡;->۬᩷ۚ(Ljava/lang/Object;)V

    return-void
.end method

.method public static ۙ(Ll/ۤۛ֫;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, -0x7e2b0494

    sget v6, Ll/ۖۙ;->ۤۧۤ:I

    sget v7, Ll/֫ۢ;->ۚ᩻᩵:I

    const-string v8, "\u1a76\u06eb"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x21

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x6441

    const v10, 0x7832f74

    xor-int/2addr v9, v10

    const v10, -0x5975040a

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v6

    mul-int/lit16 v5, v5, -0x642d

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    .line 68
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    const/4 p0, 0x0

    return-object p0

    .line 86
    :sswitch_0
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    sget v8, Ll/ۖ;->ܿۚ֡:I

    if-gez v8, :cond_c

    goto/16 :goto_3

    .line 4
    :sswitch_1
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v8

    if-lez v8, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v8, "\u06df\u1a77"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x4d

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x44f1

    const v10, 0x384d65c0

    xor-int/2addr v9, v10

    const v10, -0x77425c09

    goto :goto_0

    .line 178
    :sswitch_2
    sget-boolean v8, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v8, :cond_a

    goto/16 :goto_2

    :sswitch_3
    sget v8, Ll/᩶;->ᩴ᩶ۛ:I

    if-lez v8, :cond_5

    goto/16 :goto_3

    .line 122
    :sswitch_4
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    goto/16 :goto_3

    :sswitch_5
    return-object v4

    .line 172
    :sswitch_6
    invoke-static {v1, v2}, Ll/ۖ;->ۤ᩸۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_e

    const-string v8, "\u0733\u06d8"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x29eb

    const v10, 0x20a3ec

    xor-int/2addr v9, v10

    const v10, -0x3efc4718

    goto :goto_0

    :sswitch_7
    const/4 v8, 0x1

    .line 0
    invoke-static {v8, v2}, Ll/ۗ᩶;->ۛ᩹ᩳ(ILjava/lang/Object;)C

    move-result v8

    const/16 v9, 0x7d

    if-ne v8, v9, :cond_e

    const-string v8, "\u1a7b\u06eb"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x27

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x4dab

    const v10, -0x441bb058

    xor-int/2addr v9, v10

    const v10, -0xd45dd94

    goto/16 :goto_0

    :sswitch_8
    const/4 v8, 0x0

    .line 171
    invoke-static {v2, v8}, Ll/ۘܽ;->᩷۬ܽ(Ljava/lang/Object;I)C

    move-result v8

    const/16 v9, 0x7b

    if-ne v8, v9, :cond_e

    const-string v8, "\u1a77\u1a79"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0xb9f

    const v10, 0x26bdc4f7

    xor-int/2addr v9, v10

    const v10, 0x4f030c44

    goto/16 :goto_0

    .line 196
    :sswitch_9
    check-cast p1, Ljava/lang/String;

    .line 197
    invoke-static {v0, p1}, Ll/ܺ᩺֫;->ۙ(Lbin/mt/plugin/api/LocalString;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :sswitch_a
    const/4 v8, 0x3

    if-lt v3, v8, :cond_e

    const-string v8, "\u05ab\u0736"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x641

    const v10, -0x6156af70

    xor-int/2addr v9, v10

    const v10, 0x3a5647e

    goto/16 :goto_0

    .line 68
    :sswitch_b
    sget v8, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v8, :cond_1

    goto :goto_1

    :cond_1
    const-string v8, "\u073d\u06e2"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x26b7

    const v10, 0x5b6b17ea

    xor-int/2addr v9, v10

    const v10, -0x75d8414b

    goto/16 :goto_0

    .line 87
    :sswitch_c
    sget v8, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v8, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v8, "\u1a7a\u1a75"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x5d1f

    const v10, 0x1f53fdc2

    xor-int/2addr v9, v10

    const v10, 0x2045e1e2

    goto/16 :goto_0

    :sswitch_d
    sget v8, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v8, :cond_3

    :goto_1
    const-string v8, "\u1a7b\u06ec"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x1d

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x2ccd

    const v10, 0x6e0bf8e4

    xor-int/2addr v9, v10

    const v10, 0xbcb0104

    goto/16 :goto_0

    :cond_3
    const-string v8, "\u1a79\u073f"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x144f

    const v10, 0x2f906035

    xor-int/2addr v9, v10

    const v10, 0x6e8ab7bf

    goto/16 :goto_0

    :sswitch_e
    sget v8, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v8, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v8, "\u06e1\u1a74"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2b6d

    const v10, 0x5092942c

    xor-int/2addr v9, v10

    const v10, -0x575a83cc

    goto/16 :goto_0

    :sswitch_f
    sget v8, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v8, :cond_6

    :cond_5
    :goto_2
    const-string v8, "\u06e2\u1a74"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x7f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x5b11

    const v10, -0x31f78bc0

    xor-int/2addr v9, v10

    const v10, 0x1435c0e5

    goto/16 :goto_0

    :cond_6
    const-string v8, "\u06e7\u1a73"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x36c9

    const v10, -0xdb58e4e

    xor-int/2addr v9, v10

    const v10, 0x516c7684

    goto/16 :goto_0

    .line 185
    :sswitch_10
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v8

    if-gtz v8, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v8, "\u06e8\u06d7"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x1345

    const v10, -0x5943efed

    xor-int/2addr v9, v10

    const v10, 0x39811420

    goto/16 :goto_0

    :sswitch_11
    sget v8, Ll/֫֡;->֫ۙۖ:I

    if-gtz v8, :cond_8

    :goto_3
    const-string v8, "\u06db\u0733"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x20e1

    const v10, 0x675ab74a

    xor-int/2addr v9, v10

    const v10, -0x113d7563

    goto/16 :goto_0

    :cond_8
    const-string v8, "\u06d7\u1a77"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x29

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x1b0f

    const v10, -0x67748717

    xor-int/2addr v9, v10

    const v10, 0x5b57981a

    goto/16 :goto_0

    .line 130
    :sswitch_12
    sget v8, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v8, :cond_9

    goto :goto_4

    :cond_9
    const-string v8, "\u06db\u06e0"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x7b

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x6d2f

    const v10, 0x664e0551

    xor-int/2addr v9, v10

    const v10, 0x79660681

    goto/16 :goto_0

    :sswitch_13
    sget v8, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v8, :cond_b

    :cond_a
    :goto_4
    const-string v8, "\u05ab\u06eb"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x7d15

    const v10, -0x68f46d5d

    xor-int/2addr v9, v10

    const v10, 0x671a9ebc

    goto/16 :goto_0

    :cond_b
    const-string v8, "\u06d7\u073a"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x43

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x5f6f

    const v10, 0x2d1f64ee

    xor-int/2addr v9, v10

    const v10, -0x76c23907

    goto/16 :goto_0

    .line 171
    :sswitch_14
    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ll/ۗ֫;->᩵۠ۙ(Ljava/lang/Object;)I

    move-result v3

    sget v8, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v8, :cond_d

    :cond_c
    :goto_5
    const-string v8, "\u073d\u06e8"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x77af

    const v10, 0x2497b1ca

    xor-int/2addr v9, v10

    const v10, -0x4ba2873c

    goto/16 :goto_0

    :cond_d
    const-string v8, "\u06d9\u05a1"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x5873

    const v10, -0x67a3537

    xor-int/2addr v9, v10

    const v10, -0x229995e2

    goto/16 :goto_0

    :sswitch_15
    return-object p1

    .line 196
    :sswitch_16
    instance-of v8, p1, Ljava/lang/String;

    if-eqz v8, :cond_e

    const-string v8, "\u06e0\u0733"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x929

    const v10, -0x3fff4e8c

    xor-int/2addr v9, v10

    const v10, 0x153f858b

    goto/16 :goto_0

    .line 200
    :sswitch_17
    iget-object v1, p0, Ll/ۤۛ֫;->ܳ᩷:Lbin/mt/plugin/api/PluginContext;

    .line 171
    instance-of v8, p1, Ljava/lang/String;

    if-eqz v8, :cond_e

    const-string v8, "\u1a73\u05a8"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x33

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x4655

    const v10, -0x535781f6

    xor-int/2addr v9, v10

    const v10, -0x4c13989b

    goto/16 :goto_0

    :cond_e
    const-string v8, "\u1a75\u073a"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x927

    const v10, 0x2bac1dd7

    xor-int/2addr v9, v10

    const v10, 0x49837611

    goto/16 :goto_0

    :sswitch_18
    const/4 p0, 0x0

    return-object p0

    .line 195
    :sswitch_19
    iget-object v0, p0, Ll/ۤۛ֫;->ᩴ᩷:Ll/ۨ᩺֫;

    iget-object v0, v0, Ll/ۨ᩺֫;->ۤ:Lbin/mt/plugin/api/LocalString;

    if-eqz v0, :cond_f

    const-string v8, "\u05ab\u06db"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, 0x29

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x257b

    const v10, 0x53ef6f83

    xor-int/2addr v9, v10

    const v10, -0x4096a42c

    goto/16 :goto_0

    :cond_f
    const-string v8, "\u06d6\u1a76"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x54a9

    const v10, -0x5bc884ea

    xor-int/2addr v9, v10

    const v10, 0x624dcb77

    goto/16 :goto_0

    :sswitch_1a
    if-nez p1, :cond_10

    const-string v8, "\u06d9\u0736"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x13

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x1197

    const v10, 0x12a648db

    xor-int/2addr v9, v10

    const v10, -0x5a7bfead

    goto/16 :goto_0

    :cond_10
    const-string v8, "\u0730\u1a76"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x569b

    const v10, 0x773db9fe

    xor-int/2addr v9, v10

    const v10, -0x504bc2f9

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x78f30ecb -> :sswitch_1
        -0x742dece1 -> :sswitch_8
        -0x738c1a65 -> :sswitch_10
        -0x6d557ff8 -> :sswitch_a
        -0x6823439f -> :sswitch_14
        -0x6702c433 -> :sswitch_f
        -0x5fa101e7 -> :sswitch_e
        -0x524e9df3 -> :sswitch_6
        -0x492cb15b -> :sswitch_9
        -0x47633489 -> :sswitch_3
        -0x43eee8e1 -> :sswitch_18
        -0x3e087302 -> :sswitch_15
        -0x38887cd4 -> :sswitch_7
        -0x35818fd5 -> :sswitch_11
        -0x34ae085a -> :sswitch_19
        -0x33bf5fa0 -> :sswitch_d
        -0x3361b46a -> :sswitch_b
        -0x2feac96c -> :sswitch_2
        -0x2fabf9f6 -> :sswitch_7
        -0x26e4b89e -> :sswitch_e
        -0x2616ca36 -> :sswitch_d
        -0x1901b22d -> :sswitch_c
        -0x17da8454 -> :sswitch_4
        -0xf4b747e -> :sswitch_16
        0x250987a -> :sswitch_a
        0x3ff1bfb -> :sswitch_3
        0x6a816f0 -> :sswitch_17
        0xfbe84af -> :sswitch_19
        0x11010bed -> :sswitch_12
        0x17b96ab8 -> :sswitch_11
        0x1c94800d -> :sswitch_2
        0x280bfc0a -> :sswitch_13
        0x29d88a7d -> :sswitch_12
        0x36208e08 -> :sswitch_1a
        0x39f6a003 -> :sswitch_5
        0x3c2a5e05 -> :sswitch_1
        0x3fe286e1 -> :sswitch_15
        0x40c85a8d -> :sswitch_17
        0x44a39d3e -> :sswitch_b
        0x49749f67 -> :sswitch_5
        0x522ddffd -> :sswitch_c
        0x5511727c -> :sswitch_13
        0x565e5729 -> :sswitch_14
        0x58d22718 -> :sswitch_1a
        0x58d5c2bd -> :sswitch_4
        0x5d64fb28 -> :sswitch_f
        0x647999de -> :sswitch_16
        0x6bc5c989 -> :sswitch_8
        0x71da6a3f -> :sswitch_9
        0x756b5b5c -> :sswitch_6
        0x7aa8ec5a -> :sswitch_18
        0x7e45b0d7 -> :sswitch_10
        0x7e8b5d4b -> :sswitch_0
        0x7fd413d7 -> :sswitch_0
    .end sparse-switch
.end method

.method public static bridge synthetic ۙ(Ll/ۤۛ֫;)Ll/ۢۨ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤۛ֫;->᩸᩷:Ll/ۢۨ֫;

    return-object p0
.end method

.method public static bridge synthetic ۙ(Ll/ۤۛ֫;Lbin/mt/plugin/api/PluginContext;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۤۛ֫;->ܳ᩷:Lbin/mt/plugin/api/PluginContext;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ۤۛ֫;Ll/ܿۨ֫;Lbin/mt/plugin/api/preference/PluginPreference;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/ۤۛ֫;->ۙ(Ll/ܿۨ֫;Lbin/mt/plugin/api/preference/PluginPreference;)V

    return-void
.end method

.method private ۙ(Ll/ܿۨ֫;Lbin/mt/plugin/api/preference/PluginPreference;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, -0x2a1be5e5

    sget v11, Ll/֨ۢ;->۬ܿܺ:I

    sget v12, Ll/֨ۨ;->ۜܳ᩵:I

    const-string v13, "\u073d\u0733"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x3c05

    const v15, 0x4d371a93    # 1.9199826E8f

    xor-int/2addr v14, v15

    const v15, 0x4817aad

    :goto_0
    xor-int/2addr v13, v15

    :goto_1
    xor-int/2addr v10, v11

    mul-int/lit16 v10, v10, 0x5501

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    move-object/from16 v15, p1

    sget-object v4, Ll/ۤۛ֫;->۬ۛ֡:[S

    .line 45
    sget v13, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v13, :cond_e

    goto/16 :goto_a

    .line 138
    :sswitch_0
    sget v13, Ll/֨ۖ;->ۜۜۖ:I

    if-nez v13, :cond_0

    goto/16 :goto_5

    :cond_0
    move-object/from16 v15, p1

    goto/16 :goto_8

    :sswitch_1
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    sget v13, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v13, :cond_6

    :cond_1
    :goto_2
    move-object/from16 v15, p1

    goto/16 :goto_a

    :sswitch_2
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    sget v13, Ll/֫֨;->᩶ܺۡ:I

    if-lez v13, :cond_1

    :goto_3
    move-object/from16 v15, p1

    goto/16 :goto_9

    :sswitch_3
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    goto :goto_3

    .line 116
    :sswitch_4
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    return-void

    .line 147
    :sswitch_5
    new-instance v1, Ll/᩷ۛ֫;

    invoke-direct {v1, v0}, Ll/᩷ۛ֫;-><init>(Ll/ۤۛ֫;)V

    iput-object v1, v0, Ll/ۤۛ֫;->ۧ᩷:Ll/᩷ۛ֫;

    .line 148
    invoke-direct/range {p0 .. p0}, Ll/ۤۛ֫;->᩷ۙ()V

    return-void

    .line 142
    :sswitch_6
    move-object v13, v2

    check-cast v13, Ll/ۚܿ᩻;

    iput-object v13, v0, Ll/ۤۛ֫;->᩻᩷:Ll/ۚܿ᩻;

    .line 143
    invoke-virtual {v13}, Ll/ۚܿ᩻;->ܳ()V

    .line 144
    iget-object v13, v0, Ll/ۤۛ֫;->᩻᩷:Ll/ۚܿ᩻;

    new-instance v14, Ll/֨ۨ֫;

    .line 137
    sget v15, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v15, :cond_2

    goto :goto_4

    .line 144
    :cond_2
    invoke-direct {v14, v0}, Ll/֨ۨ֫;-><init>(Ll/ۤۛ֫;)V

    invoke-virtual {v13, v14}, Ll/᩻ᩳ᩷;->addItemDecoration(Ll/ۨ۟᩷;)V

    .line 145
    new-instance v13, Ll/ۢۨ֫;

    .line 97
    sget v14, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v14, :cond_3

    goto :goto_2

    .line 145
    :cond_3
    invoke-direct {v13, v0}, Ll/ۢۨ֫;-><init>(Ll/ۤۛ֫;)V

    iput-object v13, v0, Ll/ۤۛ֫;->᩸᩷:Ll/ۢۨ֫;

    .line 146
    iget-object v14, v0, Ll/ۤۛ֫;->᩻᩷:Ll/ۚܿ᩻;

    invoke-static {v14, v13}, Ll/ۘ۟;->᩹ᩴ᩸(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    sget v13, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v13, :cond_4

    goto :goto_2

    :cond_4
    const-string v13, "\u1a73\u1a77"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x13f9

    const v15, -0x79b198a4

    xor-int/2addr v14, v15

    const v15, -0x3b209562

    goto/16 :goto_0

    :sswitch_7
    const v2, 0x7d54a1a9

    xor-int/2addr v2, v3

    .line 142
    invoke-static {v0, v2}, Ll/ۖ᩵;->֫᩻֨(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v2

    .line 37
    sget-boolean v13, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v13, :cond_5

    :goto_4
    move-object/from16 v15, p1

    goto/16 :goto_6

    :cond_5
    const-string v13, "\u05a1\u06df"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x47d5

    const v15, 0x6b56b469

    xor-int/2addr v14, v15

    const v15, 0x4358b3af

    goto/16 :goto_0

    :sswitch_8
    const/16 v3, 0x20

    const/4 v13, 0x3

    .line 141
    invoke-static {v9, v3, v13, v8}, Ll/֨᩻;->ۧ᩹ܿ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v13

    if-gtz v13, :cond_7

    :cond_6
    :goto_5
    const-string v13, "\u06e2\u1a7b"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x59bf

    const v15, 0x37f3883b

    xor-int/2addr v14, v15

    const v15, 0x7179a951

    goto/16 :goto_0

    :cond_7
    const-string v13, "\u06da\u06e8"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x1c11

    const v15, 0x2559f3fb

    xor-int/2addr v14, v15

    const v15, 0x6ca4003f

    goto/16 :goto_0

    :sswitch_9
    iget-object v9, v0, Ll/ۤۛ֫;->ܳ᩷:Lbin/mt/plugin/api/PluginContext;

    invoke-interface {v9}, Lbin/mt/plugin/api/PluginContext;->getPreferences()Landroid/content/SharedPreferences;

    move-result-object v9

    iput-object v9, v0, Ll/ۤۛ֫;->۫᩷:Landroid/content/SharedPreferences;

    sget-object v9, Ll/ۤۛ֫;->۬ۛ֡:[S

    .line 120
    sget v13, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v13, :cond_8

    goto/16 :goto_3

    :cond_8
    const-string v13, "\u1a73\u06e1"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x3f

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x5db7

    const v15, 0x7462d2a1

    xor-int/2addr v14, v15

    const v15, 0x36da9062

    goto/16 :goto_0

    .line 135
    :sswitch_a
    iput-object v1, v0, Ll/ۤۛ֫;->֫᩷:Lbin/mt/plugin/api/preference/PluginPreference;

    .line 136
    invoke-static {}, Ll/᩹ۨ֫;->᩸()Ll/ܽ᩻ۙ;

    move-result-object v13

    new-instance v14, Ll/֡ۨ֫;

    move-object/from16 v15, p1

    invoke-direct {v14, v0, v15}, Ll/֡ۨ֫;-><init>(Ll/ۤۛ֫;Ll/ܿۨ֫;)V

    invoke-static {v13, v0, v14}, Ll/֡۟;->᩹᩹֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 126
    sget v13, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v13, :cond_9

    :goto_6
    const-string v13, "\u1a7b\u073f"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x60a9

    const v16, 0x28cd4da4

    xor-int v14, v14, v16

    const v16, 0x65f4b777

    goto/16 :goto_b

    :cond_9
    const-string v13, "\u073a\u05a8"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x11

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x3c5d

    const v16, -0x5356c8b8

    xor-int v14, v14, v16

    const v16, 0x1bfeed95

    goto/16 :goto_b

    .line 134
    :sswitch_b
    new-instance v1, Ljava/lang/NullPointerException;

    sget-object v2, Ll/ۤۛ֫;->۬ۛ֡:[S

    const/4 v3, 0x1

    const/16 v4, 0x1f

    invoke-static {v2, v3, v4, v8}, Ll/ۖۗ;->ܳܰ᩺([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :sswitch_c
    move-object/from16 v15, p1

    if-eqz v1, :cond_a

    const-string v13, "\u0733\u06da"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x57

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x7d09

    const v16, 0x78ca3763

    xor-int v14, v14, v16

    const v16, 0x3b57774e

    goto/16 :goto_b

    :cond_a
    const-string v13, "\u073d\u1a77"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x189b

    const v16, -0x6483fc20

    xor-int v14, v14, v16

    const v16, -0x599c59d0

    goto/16 :goto_b

    :sswitch_d
    move-object/from16 v15, p1

    const/16 v8, 0x5674

    goto :goto_7

    :sswitch_e
    move-object/from16 v15, p1

    const v8, 0xe0b4

    :goto_7
    const-string v13, "\u1a76\u06e4"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x552b

    const v16, 0x37b1600f

    xor-int v14, v14, v16

    const v16, 0x4ccfd819    # 1.08970184E8f

    goto/16 :goto_b

    :sswitch_f
    move-object/from16 v15, p1

    add-int v13, v5, v7

    mul-int v13, v13, v13

    sub-int v13, v6, v13

    if-gtz v13, :cond_b

    const-string v13, "\u06d9\u0733"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x25

    xor-int v14, v13, v11

    mul-int/lit8 v14, v14, 0x1b

    const v16, 0x12b77455

    xor-int v14, v14, v16

    const v16, -0x4cbdafce

    goto/16 :goto_b

    :cond_b
    const-string v13, "\u1a79\u1a75"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x2d

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x4b65

    const v16, -0x288954a3

    xor-int v14, v14, v16

    const v16, 0x632375ff

    goto/16 :goto_b

    :sswitch_10
    move-object/from16 v15, p1

    const v6, 0x1373c

    mul-int v6, v6, v5

    const/16 v7, 0x4dcf

    .line 114
    sget v13, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v13, :cond_c

    :goto_8
    const-string v13, "\u1a78\u1a73"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x41

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x5cd9

    const v16, 0x5af7e60c

    xor-int v14, v14, v16

    const v16, -0x4dc236e1

    goto/16 :goto_b

    :cond_c
    const-string v13, "\u1a79\u06e8"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x5761

    const v16, 0x15974844

    xor-int v14, v14, v16

    const v16, -0x5f206bc

    goto :goto_b

    :sswitch_11
    move-object/from16 v15, p1

    const/4 v5, 0x0

    aget-short v5, v4, v5

    .line 30
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v13

    if-nez v13, :cond_d

    :goto_9
    const-string v13, "\u06e0\u0736"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x1f

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0xc51

    const v16, -0x1e065aaf

    xor-int v14, v14, v16

    const v16, -0x73834ccf

    goto :goto_b

    :cond_d
    const-string v13, "\u0736\u0730"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x1759

    const v16, -0x317125de

    xor-int v14, v14, v16

    const v16, 0x99929cb

    goto :goto_b

    :goto_a
    const-string v13, "\u0730\u1a73"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x79

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x760b

    const v16, 0x38a12fe4

    xor-int v14, v14, v16

    const v16, -0x60d740fa

    goto :goto_b

    :cond_e
    const-string v13, "\u06d9\u06d9"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x61

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x7c47

    const v16, 0x504f6bea

    xor-int v14, v14, v16

    const v16, -0x49f7ddd4

    :goto_b
    xor-int v13, v13, v16

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ec71ef9 -> :sswitch_a
        -0x68554a21 -> :sswitch_c
        -0x56e6e1ee -> :sswitch_d
        -0x5159b824 -> :sswitch_f
        -0x4bd07cf5 -> :sswitch_0
        -0x483d7267 -> :sswitch_7
        -0x461f6e8d -> :sswitch_10
        -0x3effe776 -> :sswitch_2
        -0x32288d96 -> :sswitch_e
        -0x2dd5cd5f -> :sswitch_8
        -0x2a712aaf -> :sswitch_0
        -0x1f455936 -> :sswitch_3
        -0x1d0387b1 -> :sswitch_4
        -0x13331343 -> :sswitch_9
        -0xd225544 -> :sswitch_2
        -0xcdea70d -> :sswitch_6
        -0x618ca34 -> :sswitch_1
        0x508efc4 -> :sswitch_c
        0xad98386 -> :sswitch_7
        0x161a02e8 -> :sswitch_b
        0x2ca1b8d5 -> :sswitch_3
        0x34d0f2c4 -> :sswitch_8
        0x3cffc122 -> :sswitch_4
        0x40d73317 -> :sswitch_1
        0x4aa9c846 -> :sswitch_5
        0x50071594 -> :sswitch_11
        0x54bd3d89 -> :sswitch_a
        0x566a2218 -> :sswitch_b
        0x5c146401 -> :sswitch_9
        0x5fcd48af -> :sswitch_e
        0x67e3eb91 -> :sswitch_d
        0x680f40a3 -> :sswitch_f
        0x6bed4281 -> :sswitch_10
        0x6bee28d4 -> :sswitch_11
        0x74a57af8 -> :sswitch_5
        0x77722e5e -> :sswitch_6
    .end sparse-switch
.end method

.method public static bridge synthetic ۚ(Ll/ۤۛ֫;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤۛ֫;->ܺ᩷:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ۤ(Ll/ۤۛ֫;)Lbin/mt/plugin/api/PluginContext;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤۛ֫;->ܳ᩷:Lbin/mt/plugin/api/PluginContext;

    return-object p0
.end method

.method private ۤۙ()V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x60f592d7

    sget v4, Ll/֡۟;->᩶᩺ܰ:I

    sget v5, Ll/ۗ᩵;->ᩳܶۤ:I

    const-string v6, "\u1a7b\u06d8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x12fb

    const v8, 0x4ac57c2a    # 6471189.0f

    xor-int/2addr v7, v8

    const v8, 0x7fcf0bd5

    :goto_0
    xor-int/2addr v6, v8

    move-object v8, v0

    :goto_1
    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x3027

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 153
    invoke-static {v1}, Ll/֨ۚ;->ᩳ᩷ܺ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰ᩺֫;

    .line 154
    iget-boolean v6, v2, Ll/ܰ᩺֫;->۫:Z

    if-eqz v6, :cond_2

    const-string v6, "\u06e8\u0736"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x65

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x28b9

    const v9, -0x74c1ffd2

    xor-int/2addr v7, v9

    const v9, -0x24fa6b8a

    goto/16 :goto_8

    .line 42
    :sswitch_0
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    sget-boolean v6, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-nez v6, :cond_a

    goto :goto_2

    :sswitch_1
    sget v6, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v6, :cond_c

    goto/16 :goto_4

    .line 94
    :sswitch_2
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    sget v6, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v6, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_2
    const-string v6, "\u05ab\u1a73"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7587

    const v9, -0x2764afdc

    xor-int/2addr v7, v9

    const v9, -0x23c0e493

    goto/16 :goto_8

    .line 110
    :sswitch_3
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    return-void

    .line 155
    :sswitch_5
    iget-object v6, p0, Ll/ۤۛ֫;->ܺ᩷:Ljava/util/ArrayList;

    invoke-static {v6, v2}, Ll/֡ۢ;->ۗܶᩴ(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_3

    :sswitch_6
    return-void

    .line 153
    :sswitch_7
    invoke-static {v1}, Ll/ۘ۟;->ᩳۘ᩸(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const-string v6, "\u1a78\u06df"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x50db

    const v9, -0x47dbeba1

    xor-int/2addr v7, v9

    const v9, 0x5c68a85c

    goto/16 :goto_8

    :cond_1
    const-string v6, "\u06e1\u06e2"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x39

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x7213

    const v9, -0x453e9ca8

    xor-int/2addr v7, v9

    const v9, -0x4e15a48e

    goto/16 :goto_8

    .line 152
    :sswitch_8
    iput-object v8, p0, Ll/ۤۛ֫;->ܺ᩷:Ljava/util/ArrayList;

    .line 153
    iget-object v1, p0, Ll/ۤۛ֫;->ۚ᩷:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/ۘܽ;->ۘ֨᩶(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_3
    const-string v6, "\u1a79\u06d6"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x61

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x2e39

    const v9, 0x22455254

    xor-int/2addr v7, v9

    const v9, 0x5f6c136b

    goto/16 :goto_8

    .line 152
    :sswitch_9
    new-instance v8, Ljava/util/ArrayList;

    .line 8
    sget v6, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v6, :cond_3

    goto :goto_6

    .line 25
    :cond_3
    sget v6, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v6, :cond_4

    goto/16 :goto_7

    .line 107
    :cond_4
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v6

    if-ltz v6, :cond_5

    goto :goto_4

    .line 41
    :cond_5
    sget v6, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v6, :cond_6

    goto :goto_4

    .line 46
    :cond_6
    sget v6, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v6, :cond_7

    goto :goto_4

    .line 31
    :cond_7
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v6

    if-nez v6, :cond_8

    goto :goto_5

    .line 73
    :cond_8
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v6

    if-nez v6, :cond_9

    :goto_4
    const-string v6, "\u1a7b\u1a7b"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x4b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7361

    const v8, -0x7c8b7390

    xor-int/2addr v7, v8

    const v8, 0x5bf23199

    goto/16 :goto_0

    :cond_9
    sget v6, Ll/ۧ;->ۨۗܰ:I

    if-ltz v6, :cond_b

    :cond_a
    :goto_5
    const-string v6, "\u0733\u06eb"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x77

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0xa1b

    const v8, 0x46880707

    xor-int/2addr v7, v8

    const v8, 0x48f0f998    # 493516.75f

    goto/16 :goto_0

    .line 69
    :cond_b
    sget v6, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v6, :cond_d

    :cond_c
    :goto_6
    const-string v6, "\u073a\u0730"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x72c5

    const v8, 0xf0aec82

    xor-int/2addr v7, v8

    const v8, 0x5fe7effa

    goto/16 :goto_0

    .line 152
    :cond_d
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    sget-boolean v6, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v6, :cond_e

    :goto_7
    const-string v6, "\u1a73\u06e4"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x57

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5b4b

    const v8, -0xd9a324    # -2.21134E38f

    xor-int/2addr v7, v8

    const v8, -0xcf94cf3

    goto/16 :goto_0

    :cond_e
    const-string v6, "\u06e2\u06da"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x7d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6e7d

    const v9, 0xbbbe4dd

    xor-int/2addr v7, v9

    const v9, 0x14982883

    :goto_8
    xor-int/2addr v6, v9

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7c34c077 -> :sswitch_5
        -0x763744a6 -> :sswitch_0
        -0x685ad1ec -> :sswitch_5
        -0x682d0571 -> :sswitch_3
        -0x6435e66b -> :sswitch_8
        -0x3f865794 -> :sswitch_0
        -0x3702b94e -> :sswitch_6
        -0x291fbd69 -> :sswitch_1
        0x7aa39a9 -> :sswitch_8
        0x2b2ac8e8 -> :sswitch_4
        0x30566815 -> :sswitch_7
        0x3a645fc0 -> :sswitch_3
        0x43f1eb00 -> :sswitch_2
        0x469e5354 -> :sswitch_6
        0x4815f5f5 -> :sswitch_7
        0x4d34adf7 -> :sswitch_1
        0x508aa877 -> :sswitch_9
        0x65254c57 -> :sswitch_4
        0x6f652655 -> :sswitch_9
        0x70a190d3 -> :sswitch_2
    .end sparse-switch
.end method

.method public static bridge synthetic ۧ(Ll/ۤۛ֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۤۛ֫;->ۤۙ()V

    return-void
.end method

.method public static bridge synthetic ۫(Ll/ۤۛ֫;)Ll/ۚܿ᩻;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤۛ֫;->᩻᩷:Ll/ۚܿ᩻;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ۤۛ֫;)Ll/᩷ۛ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤۛ֫;->ۧ᩷:Ll/᩷ۛ֫;

    return-object p0
.end method

.method public static synthetic ܺ(Ll/ۤۛ֫;)Ll/ܶ᩹;
    .locals 0

    .line 47
    iget-object p0, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    return-object p0
.end method

.method public static bridge synthetic ᩴ(Ll/ۤۛ֫;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤۛ֫;->ۚ᩷:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ۤۛ֫;)Ll/ۨ᩺֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤۛ֫;->ᩴ᩷:Ll/ۨ᩺֫;

    return-object p0
.end method

.method private ᩷ۙ()V
    .locals 18

    move-object/from16 v1, p0

    const/4 v2, 0x0

    const/4 v0, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, 0x825f0f0

    sget v11, Ll/᩺;->۫۬۫:I

    sget v12, Ll/ۖ֡;->ۚۛᩳ:I

    const-string v13, "\u06e7\u05a8"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x3db3

    const v15, -0x21213f7e

    xor-int/2addr v14, v15

    const v15, -0x52d0249f

    xor-int/2addr v13, v15

    move-object v15, v2

    move-object/from16 v17, v3

    move-object v3, v0

    move-object v0, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    move-object v5, v4

    move-object/from16 v4, v17

    :goto_0
    xor-int/2addr v10, v11

    mul-int/lit16 v10, v10, 0x768f

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    .line 169
    new-instance v15, Ll/ۨ᩺֫;

    sget-boolean v13, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v13, :cond_c

    goto/16 :goto_6

    :sswitch_0
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    sget v13, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v13, :cond_d

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    sget v13, Ll/ۗ᩵;->ᩳܶۤ:I

    if-lez v13, :cond_8

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    sget v13, Ll/֡ܳ;->֨ᩳۢ:I

    if-lez v13, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v13, "\u1a75\u06d9"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x59

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x3365

    const v16, -0x7d19dd6

    xor-int v14, v14, v16

    const v16, 0x2b41c3f

    goto/16 :goto_8

    .line 186
    :sswitch_3
    sget v13, Ll/֡۟;->᩶᩺ܰ:I

    if-lez v13, :cond_1

    goto/16 :goto_6

    :cond_1
    const-string v13, "\u1a7a\u06d6"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x7f2f

    const v16, -0x52a715d7

    xor-int v14, v14, v16

    const v16, -0xedbb107

    goto/16 :goto_8

    .line 146
    :sswitch_4
    sget-boolean v13, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-nez v13, :cond_10

    goto/16 :goto_4

    .line 139
    :sswitch_5
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    goto/16 :goto_4

    .line 410
    :sswitch_6
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    :sswitch_7
    return-void

    :sswitch_8
    const/4 v13, 0x0

    .line 546
    invoke-static {v1, v0, v13}, Ll/ۗ֨;->ۛۡܰ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 185
    :sswitch_9
    iget-object v13, v1, Ll/ۤۛ֫;->ܳ᩷:Lbin/mt/plugin/api/PluginContext;

    invoke-interface {v13, v0}, Lbin/mt/plugin/api/PluginContext;->log(Ljava/lang/Throwable;)V

    .line 127
    sget v13, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v13, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v13, "\u0733\u06db"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x3519

    const v16, -0x4c700385

    xor-int v14, v14, v16

    const v16, -0x14a719fb

    goto/16 :goto_8

    .line 182
    :sswitch_a
    :try_start_0
    new-instance v13, Ll/ܿܰ֫;

    iget-object v14, v1, Ll/ۤۛ֫;->ܳ᩷:Lbin/mt/plugin/api/PluginContext;

    invoke-direct {v13, v14, v1}, Ll/ܿܰ֫;-><init>(Lbin/mt/plugin/api/PluginContext;Ll/ܽ֡֫;)V

    .line 183
    iget-object v14, v1, Ll/ۤۛ֫;->ۧ᩷:Ll/᩷ۛ֫;

    invoke-interface {v9, v13, v14}, Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceScreenCreatedListener;->onPreferenceScreenCreated(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/preference/PluginPreference$PreferenceScreen;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v13, "\u06eb\u06e0"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0xaf1

    const v16, 0x11bbf3c6

    xor-int v14, v14, v16

    const v16, 0x6922a4f9

    goto/16 :goto_8

    :catchall_0
    move-exception v0

    const-string v13, "\u1a73\u06df"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x6ba7

    const v16, -0x200aab62

    xor-int v14, v14, v16

    const v16, 0x9d8d37c

    goto/16 :goto_8

    :sswitch_b
    return-void

    .line 177
    :sswitch_c
    iget-object v13, v1, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    invoke-virtual {v13, v8}, Ll/ܶ᩹;->setSubtitle(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 180
    :sswitch_d
    iget-object v9, v1, Ll/ۤۛ֫;->ᩴ᩷:Ll/ۨ᩺֫;

    iget-object v9, v9, Ll/ۨ᩺֫;->᩸:Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceScreenCreatedListener;

    if-eqz v9, :cond_3

    const-string v13, "\u06dc\u06db"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x3199

    const v16, 0x1c1d1ab3

    xor-int v14, v14, v16

    const v16, -0x7a894ae5

    goto/16 :goto_8

    :cond_3
    :goto_1
    const-string v13, "\u06e4\u06d9"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x41

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x70a9

    const v16, 0x6a4d9cce

    xor-int v14, v14, v16

    const v16, -0x108fdf33

    goto/16 :goto_8

    .line 174
    :sswitch_e
    invoke-virtual {v1, v7}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 176
    :sswitch_f
    iget-object v8, v1, Ll/ۤۛ֫;->ᩴ᩷:Ll/ۨ᩺֫;

    iget-object v8, v8, Ll/ۨ᩺֫;->ܳ:Ljava/lang/CharSequence;

    if-eqz v8, :cond_4

    const-string v13, "\u06d9\u073f"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x35

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x6bc7

    const v16, -0x6712e312

    xor-int v14, v14, v16

    const v16, 0x3cfa23e2

    goto/16 :goto_8

    :cond_4
    :goto_2
    const-string v13, "\u06e1\u06d8"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x33

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x3da3

    const v16, -0x297f07ec

    xor-int v14, v14, v16

    const v16, -0x364c30cb

    goto/16 :goto_8

    .line 172
    :sswitch_10
    invoke-direct/range {p0 .. p0}, Ll/ۤۛ֫;->ۤۙ()V

    .line 173
    iget-object v7, v1, Ll/ۤۛ֫;->ᩴ᩷:Ll/ۨ᩺֫;

    iget-object v7, v7, Ll/ۨ᩺֫;->۫:Ljava/lang/CharSequence;

    if-eqz v7, :cond_5

    const-string v13, "\u1a74\u06df"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x68b

    const v16, -0x1b80c78a

    xor-int v14, v14, v16

    const v16, 0x182a29e6

    goto/16 :goto_8

    :cond_5
    :goto_3
    const-string v13, "\u06e0\u073f"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x3

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x7adf

    const v16, 0x19a86338

    xor-int v14, v14, v16

    const v16, 0x5bbfcd68

    goto/16 :goto_8

    .line 171
    :sswitch_11
    iput-object v6, v1, Ll/ۤۛ֫;->ۚ᩷:Ljava/util/ArrayList;

    .line 378
    sget v13, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v13, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v13, "\u1a75\u1a74"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x1f09

    const v16, 0x42ad474f

    xor-int v14, v14, v16

    const v16, -0x5f9e338c

    goto/16 :goto_8

    .line 171
    :sswitch_12
    invoke-virtual {v5}, Ll/ۨ᩺֫;->ۙ()Ljava/util/ArrayList;

    move-result-object v6

    sget v13, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v13, :cond_7

    :goto_4
    const-string v13, "\u06d8\u06d9"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x33d7

    const v16, -0x54a2f3c2

    xor-int v14, v14, v16

    const v16, 0x68b25422

    goto/16 :goto_8

    :cond_7
    const-string v13, "\u1a73\u05ab"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x52a5

    const v16, 0x35e65247

    xor-int v14, v14, v16

    const v16, -0x30c2fb96

    goto/16 :goto_8

    .line 170
    :sswitch_13
    invoke-interface {v3, v4, v15}, Lbin/mt/plugin/api/preference/PluginPreference;->onBuild(Lbin/mt/plugin/api/PluginContext;Lbin/mt/plugin/api/preference/PluginPreference$Builder;)V

    .line 171
    iget-object v5, v1, Ll/ۤۛ֫;->ᩴ᩷:Ll/ۨ᩺֫;

    .line 152
    sget-boolean v13, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v13, :cond_9

    :cond_8
    const-string v13, "\u1a75\u06d6"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x2593

    const v16, 0x4e91ffc5

    xor-int v14, v14, v16

    const v16, -0x3cafcfb2

    goto/16 :goto_8

    :cond_9
    const-string v13, "\u05ab\u06d6"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x15

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x3089

    const v16, 0x3e08419b

    xor-int v14, v14, v16

    const v16, -0x2b18c096

    goto/16 :goto_8

    .line 170
    :sswitch_14
    iget-object v4, v1, Ll/ۤۛ֫;->ܳ᩷:Lbin/mt/plugin/api/PluginContext;

    sget v13, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v13, :cond_a

    goto :goto_5

    :cond_a
    const-string v13, "\u1a7a\u06eb"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x14f

    const v16, 0x7f050c31

    xor-int v14, v14, v16

    const v16, 0x41e7e662

    goto/16 :goto_8

    .line 169
    :sswitch_15
    iput-object v15, v1, Ll/ۤۛ֫;->ᩴ᩷:Ll/ۨ᩺֫;

    .line 170
    iget-object v3, v1, Ll/ۤۛ֫;->֫᩷:Lbin/mt/plugin/api/preference/PluginPreference;

    .line 210
    sget v13, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v13, :cond_b

    :goto_5
    const-string v13, "\u1a7a\u05ab"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x7b

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x209

    const v16, -0x41e261bd

    xor-int v14, v14, v16

    const v16, 0x37be0c59

    goto :goto_8

    :cond_b
    const-string v13, "\u06d7\u05a1"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x6dfb

    const v16, -0x33841aad    # -6.6032972E7f

    xor-int v14, v14, v16

    const v16, -0x5abf9fe6

    goto :goto_8

    :cond_c
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v13

    if-gtz v13, :cond_e

    :cond_d
    const-string v13, "\u073d\u05a8"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x47

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0xcd7

    const v15, 0x60a5537a

    xor-int/2addr v14, v15

    const v15, 0xaa1cd75

    goto :goto_7

    .line 169
    :cond_e
    iget-object v13, v1, Ll/ۤۛ֫;->ܳ᩷:Lbin/mt/plugin/api/PluginContext;

    .line 192
    sget v14, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v14, :cond_f

    goto :goto_6

    .line 169
    :cond_f
    invoke-direct {v15, v13}, Ll/ۨ᩺֫;-><init>(Lbin/mt/plugin/api/PluginContext;)V

    .line 250
    sget v13, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v13, :cond_11

    :cond_10
    :goto_6
    const-string v13, "\u06df\u06df"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x53

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0xd1f

    const v15, 0xa958ee9

    xor-int/2addr v14, v15

    const v15, -0x5ea6ef19

    :goto_7
    xor-int/2addr v13, v15

    move-object v15, v2

    goto/16 :goto_0

    :cond_11
    const-string v13, "\u06dc\u0736"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x3

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x5f6b

    const v16, 0x64c950ef

    xor-int v14, v14, v16

    const v16, 0x4806b95

    :goto_8
    xor-int v13, v13, v16

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d4c2d92 -> :sswitch_f
        -0x72c6b044 -> :sswitch_d
        -0x6991cf5b -> :sswitch_14
        -0x662e9061 -> :sswitch_c
        -0x657e2e83 -> :sswitch_10
        -0x5efed3ee -> :sswitch_2
        -0x5e6dacfa -> :sswitch_1
        -0x5420cafa -> :sswitch_5
        -0x5293e551 -> :sswitch_11
        -0x4de5f61b -> :sswitch_13
        -0x428244e6 -> :sswitch_6
        -0x41b31c22 -> :sswitch_5
        -0x38ed6113 -> :sswitch_14
        -0x2f321c63 -> :sswitch_4
        -0x2e44ac65 -> :sswitch_8
        -0x272b8424 -> :sswitch_c
        -0x1db8186e -> :sswitch_3
        -0x19c5d961 -> :sswitch_4
        -0x18dbb6c7 -> :sswitch_a
        -0xe8d1beb -> :sswitch_8
        -0xcebe03a -> :sswitch_f
        -0x8bbf1a1 -> :sswitch_0
        -0x7abcd3 -> :sswitch_15
        -0x49e854 -> :sswitch_d
        -0x15dae2 -> :sswitch_a
        0x53ebdf -> :sswitch_12
        0xae0a87e -> :sswitch_6
        0x110fad6c -> :sswitch_12
        0x11d585f2 -> :sswitch_b
        0x1cb7a86e -> :sswitch_b
        0x20c5db69 -> :sswitch_11
        0x22ca409b -> :sswitch_e
        0x23b6fa8e -> :sswitch_13
        0x296eb61c -> :sswitch_9
        0x2d9a0042 -> :sswitch_7
        0x4b2091ec -> :sswitch_0
        0x4bd8f359 -> :sswitch_15
        0x53c12a3a -> :sswitch_7
        0x5c7cd129 -> :sswitch_2
        0x6b78aec6 -> :sswitch_10
        0x6b89ceed -> :sswitch_9
        0x6fefac4d -> :sswitch_e
        0x74f7adde -> :sswitch_1
        0x7ab046fd -> :sswitch_3
    .end sparse-switch
.end method

.method public static bridge synthetic ᩸(Ll/ۤۛ֫;)Landroid/content/SharedPreferences;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤۛ֫;->۫᩷:Landroid/content/SharedPreferences;

    return-object p0
.end method

.method public static synthetic ᩻(Ll/ۤۛ֫;)Ll/ܶ᩹;
    .locals 0

    .line 47
    iget-object p0, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    return-object p0
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 28

    move-object/from16 v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v20, 0x55c5a3b5

    sget v21, Ll/ۖ֨;->֨ۨۧ:I

    sget v22, Ll/ۖ֡;->ۚۛᩳ:I

    const-string v23, "\u0736\u06df"

    invoke-static/range {v23 .. v23}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v22

    xor-int v0, v23, v21

    mul-int/lit16 v0, v0, -0x5791

    const v25, -0x3da9fe6c

    xor-int v0, v0, v25

    const v25, 0x3174b620

    xor-int v23, v23, v25

    move-object v6, v5

    move-object v9, v8

    move-object/from16 v16, v10

    move-object/from16 v25, v15

    move-object/from16 v13, v17

    move/from16 v24, v23

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v23, 0x55c5a3b5

    move-object v5, v4

    move-object v8, v7

    const/4 v7, 0x0

    move-object v4, v3

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v11, v23, v21

    mul-int/lit16 v11, v11, 0x34e7

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v0, v11

    xor-int v23, v24, v0

    sparse-switch v23, :sswitch_data_0

    move-object/from16 v24, v9

    const v0, 0x7eda63a2

    xor-int v0, v20, v0

    .line 70
    invoke-static {v1, v0}, Ll/ۖ᩵;->֫᩻֨(Ljava/lang/Object;I)Landroid/view/View;

    sget-object v25, Ll/ۤۛ֫;->۬ۛ֡:[S

    const/16 v12, 0x27

    .line 219
    sget v0, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v0, :cond_11

    goto/16 :goto_e

    .line 322
    :sswitch_0
    sget v0, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v0, :cond_0

    goto :goto_2

    :cond_0
    move-object/from16 v24, v9

    move/from16 v26, v12

    goto/16 :goto_8

    :sswitch_1
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    sget v0, Ll/ۘܽ;->᩹ۧۚ:I

    if-lez v0, :cond_2

    :cond_1
    move-object/from16 v24, v9

    move-object/from16 v9, v25

    goto/16 :goto_12

    :cond_2
    const-string v0, "\u1a78\u06e7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v11, v0, v22

    mul-int/lit16 v11, v11, -0x7e77

    const v24, 0x452cfb09

    xor-int v11, v11, v24

    const v24, -0x95e6492

    goto/16 :goto_5

    .line 3
    :sswitch_2
    sget-boolean v0, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    const-string v0, "\u06db\u06eb"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v11, v0, v21

    mul-int/lit16 v11, v11, 0x6893

    const v24, 0x2a87d4ac

    xor-int v11, v11, v24

    const v24, 0x58c509aa

    goto :goto_5

    .line 855
    :sswitch_3
    sget v0, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v0, :cond_5

    :cond_4
    :goto_1
    move-object/from16 v24, v9

    goto/16 :goto_e

    :cond_5
    :goto_2
    const-string v0, "\u06d9\u06e4"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v11, v0, v22

    mul-int/lit16 v11, v11, 0x6877

    const v24, -0x525dd47f

    xor-int v11, v11, v24

    const v24, 0x4967bbc0    # 949180.0f

    goto :goto_5

    :sswitch_4
    sget v0, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    const-string v0, "\u1a7b\u1a74"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, 0x25

    xor-int v11, v0, v21

    mul-int/lit16 v11, v11, -0x5995

    const v24, -0x62a80554

    xor-int v11, v11, v24

    const v24, 0xbd27b52

    goto :goto_5

    :sswitch_5
    sget v0, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v0, :cond_1

    goto :goto_4

    .line 758
    :sswitch_6
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_4

    .line 734
    :sswitch_7
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    sget v0, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v0, :cond_7

    :goto_3
    move-object/from16 v24, v9

    move-object/from16 v9, v25

    goto/16 :goto_13

    :cond_7
    :goto_4
    const-string v0, "\u073f\u06d7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, 0x27

    xor-int v11, v0, v21

    mul-int/lit16 v11, v11, 0x246f

    const v24, 0x706b7d23

    xor-int v11, v11, v24

    const v24, 0x4e2e74dc    # 7.317235E8f

    :goto_5
    xor-int v24, v0, v24

    goto/16 :goto_d

    .line 559
    :sswitch_8
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    goto :goto_3

    :sswitch_9
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    :sswitch_a
    return-void

    .line 879
    :sswitch_b
    invoke-virtual {v8}, Ll/ܿۨ֫;->᩷()Lbin/mt/plugin/api/PluginContext;

    move-result-object v0

    check-cast v0, Ll/᩵᩺֫;

    sget-object v2, Ll/ۤۛ֫;->۬ۛ֡:[S

    const/16 v3, 0x57

    const/16 v4, 0x17

    invoke-static {v2, v3, v4, v15}, Ll/֨ۢ;->ܰ֫֡([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v9}, Ll/᩵᩺֫;->log(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    invoke-virtual {v1, v9, v7}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Z)V

    return-void

    .line 88
    :sswitch_c
    :try_start_0
    invoke-static/range {p0 .. p0}, Ll/ۖۜ;->᩺۬ۡ(Ljava/lang/Object;)Landroid/content/Intent;

    move-result-object v0

    sget-object v11, Ll/ۤۛ֫;->۬ۛ֡:[S
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object/from16 v24, v9

    const/16 v9, 0x47

    move/from16 v26, v12

    const/16 v12, 0x10

    :try_start_1
    invoke-static {v11, v9, v12, v15}, Ll/᩺;->۠᩸ۧ([SIII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v0, v9}, Ll/֡ᩴ;->ۨۜۜ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ll/ܿۨ֫;->᩸(Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference;

    move-result-object v0

    .line 89
    invoke-virtual {v8}, Ll/ܿۨ֫;->᩷()Lbin/mt/plugin/api/PluginContext;

    move-result-object v9

    iput-object v9, v1, Ll/ۤۛ֫;->ܳ᩷:Lbin/mt/plugin/api/PluginContext;

    .line 90
    invoke-direct {v1, v8, v0}, Ll/ۤۛ֫;->ۙ(Ll/ܿۨ֫;Lbin/mt/plugin/api/preference/PluginPreference;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v0, "\u1a7a\u1a7b"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x4f

    xor-int v9, v0, v22

    mul-int/lit16 v9, v9, 0x54d

    const v11, 0x4f762c6c

    xor-int/2addr v9, v11

    const v11, 0x7ab479c

    goto/16 :goto_a

    :catchall_0
    move-exception v0

    goto :goto_6

    :catchall_1
    move-exception v0

    move/from16 v26, v12

    :goto_6
    move-object v9, v0

    const-string v0, "\u073f\u1a7a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v11, v0, v21

    mul-int/lit16 v11, v11, -0x728b

    const v12, -0x78dd6e6e

    xor-int/2addr v11, v12

    const v12, -0x72be2391

    xor-int v24, v0, v12

    move v0, v11

    move/from16 v12, v26

    goto/16 :goto_0

    .line 97
    :sswitch_d
    new-instance v0, Ll/۟ۨ֫;

    invoke-direct {v0, v1, v8}, Ll/۟ۨ֫;-><init>(Ll/ۤۛ֫;Ll/ܿۨ֫;)V

    .line 126
    invoke-static {v0}, Ll/ۗܰ;->ۜ᩺ᩴ(Ljava/lang/Object;)V

    return-void

    :sswitch_e
    move-object/from16 v24, v9

    move/from16 v26, v12

    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    sget-object v9, Ll/ۤۛ֫;->۬ۛ֡:[S

    const/16 v11, 0x35

    const/16 v12, 0x12

    invoke-static {v9, v11, v12, v15}, Ll/ۧ;->ۘۧۜ([SIII)Ljava/lang/String;

    move-result-object v9

    .line 786
    sget-boolean v11, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v11, :cond_8

    move-object/from16 v9, v25

    move/from16 v12, v26

    goto/16 :goto_12

    .line 83
    :cond_8
    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v6}, Ll/֫۠;->ۧۜܿ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ll/֨ۢ;->ܿܽ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v7}, Ll/ܽ֡֫;->ۙ(Ljava/lang/String;Z)V

    return-void

    :sswitch_f
    move-object/from16 v24, v9

    move/from16 v26, v12

    .line 86
    invoke-virtual {v8}, Ll/ܿۨ֫;->ܰ()Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "\u1a7b\u0730"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v9, v0, v21

    mul-int/lit8 v9, v9, -0x3d

    const v11, 0x54cf6029

    xor-int/2addr v9, v11

    const v11, 0x7348dd4a

    goto/16 :goto_a

    :cond_9
    const-string v0, "\u06d8\u1a79"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v21, v0

    mul-int/lit8 v0, v0, 0x79

    xor-int v9, v0, v22

    mul-int/lit16 v9, v9, 0x575f

    const v11, 0x508f4699

    xor-int/2addr v9, v11

    const v11, 0x1787347f

    goto/16 :goto_a

    :sswitch_10
    move-object/from16 v24, v9

    move/from16 v26, v12

    .line 79
    invoke-static {v6}, Ll/᩹ۨ֫;->ۤ(Ljava/lang/String;)Ll/ܿۨ֫;

    move-result-object v0

    goto :goto_7

    :sswitch_11
    move-object/from16 v24, v9

    move/from16 v26, v12

    const/4 v7, 0x1

    if-nez v8, :cond_a

    const-string v0, "\u05a8\u073a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v9, v0, v22

    mul-int/lit16 v9, v9, -0x1893

    const v11, -0x624dbf94

    xor-int/2addr v9, v11

    const v11, -0x710f8750

    goto/16 :goto_a

    :cond_a
    const-string v0, "\u06d9\u0736"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, 0xd

    xor-int v9, v0, v21

    mul-int/lit16 v9, v9, -0x2edd

    const v11, -0x69fd98d1

    xor-int/2addr v9, v11

    const v11, -0x7b014e8b

    goto/16 :goto_a

    :sswitch_12
    move-object/from16 v24, v9

    move/from16 v26, v12

    .line 78
    invoke-static {v6}, Ll/ۖ᩵;->ۡ֫۠(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "\u06d8\u06d7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v9, v0, v21

    mul-int/lit16 v9, v9, -0x40e9

    const v11, 0x1c5b63ca

    xor-int/2addr v9, v11

    const v11, 0x28c2144a

    goto/16 :goto_a

    :sswitch_13
    move-object/from16 v24, v9

    move/from16 v26, v12

    const/4 v0, 0x0

    :goto_7
    move-object v8, v0

    const-string v0, "\u05a1\u06db"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v9, v0, v22

    mul-int/lit16 v9, v9, 0x7e13

    const v11, 0x68565f87

    xor-int/2addr v9, v11

    const v11, 0x617ac4a0

    goto/16 :goto_a

    :sswitch_14
    move-object/from16 v24, v9

    move/from16 v26, v12

    .line 76
    sget-object v0, Ll/ۤۛ֫;->۬ۛ֡:[S

    const/16 v6, 0x2d

    const/16 v9, 0x8

    invoke-static {v0, v6, v9, v15}, Ll/ۗ᩸;->۫ᩳۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Ll/֡᩻;->ܿۨ֡(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_b

    const-string v0, "\u0730\u1a74"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, -0x9

    xor-int v9, v0, v21

    mul-int/lit16 v9, v9, -0x4473

    const v11, 0x6751390d

    xor-int/2addr v9, v11

    const v11, 0x5bdd836c

    goto/16 :goto_a

    :cond_b
    const-string v0, "\u06e4\u06ec"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v9, v0, v22

    mul-int/lit16 v9, v9, -0x52ef

    const v11, 0xdf873ee

    xor-int/2addr v9, v11

    const v11, 0x6a1c669b

    goto/16 :goto_a

    :sswitch_15
    move-object/from16 v24, v9

    move/from16 v26, v12

    .line 75
    new-instance v0, Ll/֫᩶ۤ;

    const/4 v5, 0x4

    invoke-direct {v0, v5, v1}, Ll/֫᩶ۤ;-><init>(ILjava/lang/Object;)V

    invoke-static {v4, v0}, Ll/ۗۖ;->᩷ۛۖ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    invoke-static/range {p0 .. p0}, Ll/۬;->ܺۗ۠(Ljava/lang/Object;)Landroid/content/Intent;

    move-result-object v5

    .line 586
    sget v0, Ll/ۖ;->ܿۚ֡:I

    if-ltz v0, :cond_c

    :goto_8
    const-string v0, "\u06d8\u06e1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v9, v0, v22

    mul-int/lit16 v9, v9, 0x6bc5

    const v11, -0x7e25888e

    xor-int/2addr v9, v11

    const v11, 0x58aa0610

    goto/16 :goto_a

    :cond_c
    const-string v0, "\u0730\u06db"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v9, v0, v21

    mul-int/lit16 v9, v9, 0x6003

    const v11, -0x3f7321f9

    xor-int/2addr v9, v11

    const v11, 0x161454

    goto/16 :goto_a

    :sswitch_16
    move-object/from16 v24, v9

    move/from16 v26, v12

    .line 72
    iput-object v3, v1, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    .line 73
    invoke-static {v1, v3}, Ll/ۖۗ;->ܰ᩵ۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    invoke-static/range {p0 .. p0}, Ll/֡ۖ;->ܶܺۡ(Ljava/lang/Object;)V

    .line 75
    iget-object v4, v1, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    sget v0, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v0, :cond_d

    goto :goto_9

    :cond_d
    const-string v0, "\u06eb\u05a8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x9

    xor-int v9, v0, v22

    mul-int/lit16 v9, v9, 0x7125

    const v11, -0x155f309b

    xor-int/2addr v9, v11

    const v11, -0x330d8010

    goto :goto_a

    :sswitch_17
    move-object/from16 v24, v9

    move/from16 v26, v12

    .line 71
    invoke-static {v13, v14, v10, v15}, Ll/ۗ֡;->ۘ᩺ۘ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    const v3, 0x7d101360

    xor-int/2addr v0, v3

    .line 72
    invoke-static {v1, v0}, Ll/ۖ᩵;->֫᩻֨(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ll/ܶ᩹;

    .line 637
    sget v0, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v0, :cond_e

    goto :goto_9

    :cond_e
    const-string v0, "\u06e2\u0736"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, 0xd

    xor-int v9, v0, v21

    mul-int/lit16 v9, v9, -0x5f1d

    const v11, 0x72332308

    xor-int/2addr v9, v11

    const v11, 0x50745007

    goto :goto_a

    :sswitch_18
    move-object/from16 v24, v9

    move/from16 v26, v12

    .line 71
    invoke-static {v1, v2}, Ll/֫֨;->ܿ᩷ܽ(Ljava/lang/Object;I)Landroid/view/View;

    sget-object v13, Ll/ۤۛ֫;->۬ۛ֡:[S

    const/16 v14, 0x2a

    const/4 v10, 0x3

    sget v0, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v0, :cond_f

    :goto_9
    move-object/from16 v9, v25

    move/from16 v12, v26

    goto :goto_b

    :cond_f
    const-string v0, "\u06e1\u0730"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v9, v0, v22

    mul-int/lit16 v9, v9, 0x1487

    const v11, 0x58e96dcd

    xor-int/2addr v9, v11

    const v11, -0x5e217311

    :goto_a
    xor-int/2addr v0, v11

    move/from16 v12, v26

    goto/16 :goto_10

    :sswitch_19
    move-object/from16 v24, v9

    move/from16 v26, v12

    const/4 v0, 0x3

    move-object/from16 v9, v25

    .line 70
    invoke-static {v9, v12, v0, v15}, Ll/ۘ۟;->᩷᩶۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    const v2, 0x7e9f520a

    xor-int/2addr v2, v0

    .line 125
    sget v0, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v0, :cond_10

    :goto_b
    const-string v0, "\u06dc\u073a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, 0x69

    xor-int v11, v0, v21

    mul-int/lit16 v11, v11, -0x4303

    const v25, 0x35563181

    xor-int v11, v11, v25

    const v25, 0x2af7df4f

    goto :goto_c

    :cond_10
    const-string v0, "\u06e4\u073d"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v11, v0, v22

    mul-int/lit16 v11, v11, -0x7e05

    const v25, -0x28df7974

    xor-int v11, v11, v25

    const v25, -0x474b80b9

    :goto_c
    xor-int v0, v0, v25

    move-object/from16 v25, v9

    move-object/from16 v9, v24

    move/from16 v24, v0

    :goto_d
    move v0, v11

    goto/16 :goto_0

    :goto_e
    const-string v0, "\u1a73\u1a77"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v9, v0, v21

    mul-int/lit16 v9, v9, -0x230d

    const v11, -0x1387e479

    xor-int/2addr v9, v11

    const v11, -0x2233eca9

    goto :goto_f

    :cond_11
    const-string v0, "\u1a75\u05ab"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v9, v0, v21

    mul-int/lit16 v9, v9, 0x1c89

    const v11, 0x5bfda98

    xor-int/2addr v9, v11

    const v11, -0x4ebc320d

    :goto_f
    xor-int/2addr v0, v11

    :goto_10
    move-object/from16 v27, v24

    move/from16 v24, v0

    move v0, v9

    move-object/from16 v9, v27

    goto/16 :goto_0

    :sswitch_1a
    move-object/from16 v24, v9

    move-object/from16 v9, v25

    .line 69
    invoke-super/range {p0 .. p1}, Ll/ܽ֡֫;->onCreate(Landroid/os/Bundle;)V

    sget-object v0, Ll/ۤۛ֫;->۬ۛ֡:[S

    const/16 v11, 0x24

    const/4 v1, 0x3

    invoke-static {v0, v11, v1, v15}, Ll/֫֡;->ܺۜᩴ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v20

    sget-boolean v0, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v0, :cond_12

    goto/16 :goto_13

    :cond_12
    const-string v0, "\u073d\u1a77"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, -0x4567

    const v11, 0x6e051607

    xor-int/2addr v1, v11

    const v11, -0x198b9a66

    goto/16 :goto_14

    :sswitch_1b
    move-object/from16 v24, v9

    move-object/from16 v9, v25

    const v0, 0xba93

    const v15, 0xba93

    goto :goto_11

    :sswitch_1c
    move-object/from16 v24, v9

    move-object/from16 v9, v25

    const/16 v0, 0x602f

    const/16 v15, 0x602f

    :goto_11
    const-string v0, "\u1a73\u0736"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, 0x3f

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0x20b7

    const v11, 0x67cd5a03

    xor-int/2addr v1, v11

    const v11, -0x1fa1c316

    goto/16 :goto_14

    :sswitch_1d
    move-object/from16 v24, v9

    move-object/from16 v9, v25

    mul-int v0, v19, v19

    mul-int/lit8 v1, v18, 0x2

    add-int/lit8 v1, v1, 0x1

    sub-int/2addr v0, v1

    if-gez v0, :cond_13

    const-string v0, "\u06db\u06db"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0x44f

    const v11, 0x716ca77b

    xor-int/2addr v1, v11

    const v11, 0x322cdfcf

    goto/16 :goto_14

    :cond_13
    const-string v0, "\u06e2\u1a77"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x60af

    const v11, 0x7f0e029f

    xor-int/2addr v1, v11

    const v11, -0x5dab33d6

    goto :goto_14

    :sswitch_1e
    move-object/from16 v24, v9

    move-object/from16 v9, v25

    aget-short v18, v16, v17

    add-int/lit8 v19, v18, 0x1

    .line 743
    sget v0, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v0, :cond_14

    :goto_12
    const-string v0, "\u073d\u073a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x70bd

    const v11, -0x48568c98

    xor-int/2addr v1, v11

    const v11, -0x4940f817

    goto :goto_14

    :cond_14
    const-string v0, "\u06e8\u05ab"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, -0x4b

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x22d1

    const v11, 0x39bd4828

    xor-int/2addr v1, v11

    const v11, 0x36025f3a

    goto :goto_14

    :sswitch_1f
    move-object/from16 v24, v9

    move-object/from16 v9, v25

    sget-object v16, Ll/ۤۛ֫;->۬ۛ֡:[S

    const/16 v17, 0x23

    .line 292
    sget v0, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v0, :cond_15

    :goto_13
    const-string v0, "\u0730\u06e0"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, -0x67b7

    const v11, -0x682cc5df

    xor-int/2addr v1, v11

    const v11, 0x4e0b95c4    # 5.85462E8f

    goto :goto_14

    :cond_15
    const-string v0, "\u06da\u0733"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, 0x71

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0x6ead

    const v11, 0x262b3c6f

    xor-int/2addr v1, v11

    const v11, -0x7cd1ab83

    :goto_14
    xor-int/2addr v0, v11

    move-object/from16 v25, v9

    move-object/from16 v9, v24

    move/from16 v24, v0

    move v0, v1

    move-object/from16 v1, p0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c7f0acf -> :sswitch_1e
        -0x78510a70 -> :sswitch_b
        -0x763b537e -> :sswitch_19
        -0x716729c0 -> :sswitch_1
        -0x6ccec4e1 -> :sswitch_1d
        -0x68191546 -> :sswitch_8
        -0x67c684d3 -> :sswitch_9
        -0x64865137 -> :sswitch_e
        -0x6303ee1a -> :sswitch_1c
        -0x611ded87 -> :sswitch_17
        -0x60aa944e -> :sswitch_4
        -0x51bc9cc6 -> :sswitch_16
        -0x4b76c951 -> :sswitch_8
        -0x48b7855d -> :sswitch_11
        -0x43d14eb6 -> :sswitch_13
        -0x40628592 -> :sswitch_7
        -0x3f340051 -> :sswitch_10
        -0x35f40a58 -> :sswitch_14
        -0x2f071d8d -> :sswitch_12
        -0x2ecde154 -> :sswitch_1a
        -0x2ced2c88 -> :sswitch_19
        -0x25db64db -> :sswitch_d
        -0x1a703907 -> :sswitch_1e
        -0x17dae949 -> :sswitch_3
        -0x16959c8c -> :sswitch_15
        -0x10ecffd7 -> :sswitch_b
        -0xdcc4731 -> :sswitch_0
        -0xcdb6353 -> :sswitch_1b
        0x5d52312 -> :sswitch_2
        0x91ebdd8 -> :sswitch_1d
        0xf8abeea -> :sswitch_4
        0x1119c602 -> :sswitch_c
        0x12422558 -> :sswitch_9
        0x136580c9 -> :sswitch_7
        0x1e9f44f4 -> :sswitch_a
        0x2090ab58 -> :sswitch_2
        0x2ab1a687 -> :sswitch_d
        0x31b980de -> :sswitch_11
        0x3a97f587 -> :sswitch_3
        0x3da457e8 -> :sswitch_13
        0x3e1673c6 -> :sswitch_5
        0x41b38dd8 -> :sswitch_c
        0x41e971f0 -> :sswitch_12
        0x4a90e9e8 -> :sswitch_10
        0x4b385cd6 -> :sswitch_15
        0x4d848469 -> :sswitch_a
        0x507e23f2 -> :sswitch_1b
        0x53267714 -> :sswitch_1f
        0x53ada7b0 -> :sswitch_6
        0x58c2c57b -> :sswitch_e
        0x5aa22d33 -> :sswitch_1
        0x5b0bc09e -> :sswitch_16
        0x6073fe78 -> :sswitch_1a
        0x608deb2d -> :sswitch_6
        0x61123bc3 -> :sswitch_1f
        0x6244d6a2 -> :sswitch_14
        0x693c0dc5 -> :sswitch_5
        0x6e86a8c7 -> :sswitch_18
        0x746628a6 -> :sswitch_1c
        0x74d566f1 -> :sswitch_f
        0x77ec5bd9 -> :sswitch_17
        0x79a02858 -> :sswitch_0
        0x7a28abe4 -> :sswitch_18
        0x7ac87cd5 -> :sswitch_f
    .end sparse-switch
.end method

.method public final ᩶()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
