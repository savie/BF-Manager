.class public final Ll/ܰۧ᩻;
.super Ljava/lang/Object;
.source "E6PC"


# instance fields
.field public final ֫:Ljava/lang/CharSequence;

.field public final ۙ:Ljava/util/ArrayList;

.field public final ۚ:Ljava/util/ArrayList;

.field public ۤ:J

.field public final ۧ:Z

.field public final ۫:Ljava/lang/String;

.field public ܳ:Ljava/lang/String;

.field public final ܺ:I

.field public final ܽ:Z

.field public final ᩴ:Ljava/util/ArrayList;

.field public ᩷:Ll/ۤ᩻ᩴ;

.field public final ᩸:Ljava/util/ArrayList;

.field public final ᩻:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;ZIZ)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܰۧ᩻;->ۚ:Ljava/util/ArrayList;

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܰۧ᩻;->ᩴ:Ljava/util/ArrayList;

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܰۧ᩻;->ۙ:Ljava/util/ArrayList;

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܰۧ᩻;->᩻:Ljava/util/ArrayList;

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܰۧ᩻;->᩸:Ljava/util/ArrayList;

    const-string v0, "//__MTSX_FORMAT_DIRECTIVE_"

    .line 27
    iput-object v0, p0, Ll/ܰۧ᩻;->ܳ:Ljava/lang/String;

    .line 32
    iput-object p1, p0, Ll/ܰۧ᩻;->֫:Ljava/lang/CharSequence;

    .line 33
    iput-boolean p2, p0, Ll/ܰۧ᩻;->ܽ:Z

    .line 34
    iput p3, p0, Ll/ܰۧ᩻;->ܺ:I

    .line 35
    iput-boolean p4, p0, Ll/ܰۧ᩻;->ۧ:Z

    const/4 p2, 0x0

    .line 37
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p3

    const/16 p4, 0xa

    const/16 v0, 0xd

    if-ge p2, p3, :cond_0

    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p3

    if-eq p3, v0, :cond_0

    .line 38
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p3

    if-eq p3, p4, :cond_0

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 39
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-ge p2, p3, :cond_2

    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p3

    if-ne p3, v0, :cond_2

    add-int/lit8 p2, p2, 0x1

    .line 40
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-ge p2, p3, :cond_1

    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    if-ne p1, p4, :cond_1

    const-string p1, "\r\n"

    goto :goto_1

    :cond_1
    const-string p1, "\r"

    goto :goto_1

    :cond_2
    const-string p1, "\n"

    :goto_1
    iput-object p1, p0, Ll/ܰۧ᩻;->۫:Ljava/lang/String;

    return-void
.end method

.method public static ۙ()V
    .locals 1

    .line 320
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0
.end method

.method public static ۙ(Ljava/lang/CharSequence;ZIZLl/ۤ᩻ᩴ;)V
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p4

    .line 44
    new-instance v4, Ll/ܰۧ᩻;

    move/from16 v5, p3

    invoke-direct {v4, v0, v1, v2, v5}, Ll/ܰۧ᩻;-><init>(Ljava/lang/CharSequence;ZIZ)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    .line 62
    :goto_0
    iget-object v9, v4, Ll/ܰۧ᩻;->֫:Ljava/lang/CharSequence;

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v10

    iget-object v11, v4, Ll/ܰۧ᩻;->ۚ:Ljava/util/ArrayList;

    if-ge v5, v10, :cond_1b

    .line 63
    invoke-static {}, Ll/ܰۧ᩻;->ۙ()V

    move v10, v5

    .line 65
    :goto_1
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v12

    const/16 v13, 0xa

    const/16 v14, 0xd

    if-ge v10, v12, :cond_2

    invoke-interface {v9, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    if-eq v12, v14, :cond_2

    invoke-interface {v9, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    if-eq v12, v13, :cond_2

    and-int/lit16 v12, v10, 0xfff

    if-nez v12, :cond_0

    .line 66
    invoke-static {}, Ll/ܰۧ᩻;->ۙ()V

    .line 67
    :cond_0
    invoke-interface {v9, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    .line 68
    invoke-static {v12}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v13

    if-nez v13, :cond_1

    const/16 v13, 0x2c

    if-eq v12, v13, :cond_1

    iget-wide v12, v4, Ll/ܰۧ᩻;->ۤ:J

    const-wide/16 v14, 0x1

    add-long/2addr v12, v14

    iput-wide v12, v4, Ll/ܰۧ᩻;->ۤ:J

    :cond_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 72
    :cond_2
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v12

    if-ge v10, v12, :cond_3

    add-int/lit8 v12, v10, 0x1

    invoke-interface {v9, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v15

    if-ne v15, v14, :cond_4

    .line 73
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v14

    if-ge v12, v14, :cond_4

    invoke-interface {v9, v12}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v14

    if-ne v14, v13, :cond_4

    add-int/lit8 v12, v10, 0x2

    goto :goto_2

    :cond_3
    move v12, v10

    :cond_4
    :goto_2
    move v13, v5

    :goto_3
    if-ge v13, v10, :cond_6

    .line 75
    invoke-interface {v9, v13}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v14

    const/16 v15, 0x20

    if-eq v14, v15, :cond_5

    const/16 v15, 0x9

    if-eq v14, v15, :cond_5

    const/16 v15, 0xc

    if-ne v14, v15, :cond_6

    :cond_5
    add-int/lit8 v13, v13, 0x1

    goto :goto_3

    :cond_6
    const-string v14, "elif"

    const-string v15, "if"

    const/16 v16, -0x1

    const-string v0, "endif"

    const-string v1, "else"

    if-eq v13, v10, :cond_e

    .line 118
    invoke-interface {v9, v13}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v3, 0x23

    if-eq v2, v3, :cond_7

    goto :goto_7

    :cond_7
    add-int/lit8 v2, v13, 0x1

    move v3, v2

    :goto_4
    if-ge v3, v10, :cond_8

    .line 120
    invoke-interface {v9, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v17

    invoke-static/range {v17 .. v17}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v17

    if-nez v17, :cond_8

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 121
    :cond_8
    invoke-static {v2, v3, v9}, Ll/ᩳۚۤ;->ۙ(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    .line 122
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto :goto_5

    :sswitch_0
    const-string v3, "error"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_5

    :cond_9
    const/4 v3, 0x4

    goto :goto_6

    :sswitch_1
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_5

    :cond_a
    const/4 v3, 0x3

    goto :goto_6

    :sswitch_2
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    goto :goto_5

    :cond_b
    const/4 v3, 0x2

    goto :goto_6

    :sswitch_3
    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    goto :goto_5

    :cond_c
    const/4 v3, 0x1

    goto :goto_6

    :sswitch_4
    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    goto :goto_5

    :cond_d
    const/4 v3, 0x0

    goto :goto_6

    :goto_5
    const/4 v3, -0x1

    :goto_6
    packed-switch v3, :pswitch_data_0

    :cond_e
    :goto_7
    const/4 v2, 0x0

    :pswitch_0
    if-eqz v2, :cond_1a

    .line 78
    new-instance v3, Ll/᩺ۧ᩻;

    move/from16 v17, v10

    new-instance v10, Ll/ܿ۫ܺ;

    invoke-direct {v10, v7, v5, v9}, Ll/ܿ۫ܺ;-><init>(IILjava/lang/CharSequence;)V

    move/from16 p3, v13

    const/4 v13, 0x0

    invoke-direct {v3, v7, v10, v6, v13}, Ll/᩺ۧ᩻;-><init>(ILl/ܿ۫ܺ;Ll/ۨۧ᩻;Ljava/lang/String;)V

    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v6, :cond_f

    const/4 v3, 0x0

    goto :goto_8

    .line 79
    :cond_f
    iget-object v3, v6, Ll/ۨۧ᩻;->ۤ:Ll/ۛۧ᩻;

    .line 81
    :goto_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_1

    goto :goto_9

    :sswitch_5
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_10

    goto :goto_9

    :cond_10
    const/16 v16, 0x3

    goto :goto_9

    :sswitch_6
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    goto :goto_9

    :cond_11
    const/16 v16, 0x2

    goto :goto_9

    :sswitch_7
    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_12

    goto :goto_9

    :cond_12
    const/16 v16, 0x1

    goto :goto_9

    :sswitch_8
    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_13

    goto :goto_9

    :cond_13
    const/16 v16, 0x0

    :goto_9
    packed-switch v16, :pswitch_data_1

    const/4 v3, 0x0

    move-object v1, v6

    goto/16 :goto_b

    :pswitch_1
    const-string v6, "Unexpected #"

    if-eqz v3, :cond_17

    .line 89
    iget-object v7, v3, Ll/ۛۧ᩻;->ᩴ:Ll/ۨۧ᩻;

    .line 91
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 94
    iget-boolean v0, v3, Ll/ۛۧ᩻;->᩷:Z

    if-nez v0, :cond_14

    iget v0, v3, Ll/ۛۧ᩻;->ۙ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v3, Ll/ۛۧ᩻;->ۙ:I

    :cond_14
    move-object v1, v7

    move-object v6, v1

    goto :goto_b

    .line 96
    :cond_15
    iget-boolean v0, v3, Ll/ۛۧ᩻;->᩷:Z

    if-nez v0, :cond_16

    .line 97
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, v3, Ll/ۛۧ᩻;->᩷:Z

    .line 98
    new-instance v6, Ll/ۨۧ᩻;

    iget v0, v3, Ll/ۛۧ᩻;->ۙ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, v3, Ll/ۛۧ᩻;->ۙ:I

    invoke-direct {v6, v3, v0}, Ll/ۨۧ᩻;-><init>(Ll/ۛۧ᩻;I)V

    move-object v1, v6

    move-object v6, v7

    goto :goto_b

    :cond_16
    const-string v0, " after #else"

    .line 0
    invoke-static {v6, v2, v0}, Ll/ܰ۟ۙ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 316
    new-instance v1, Ll/ܿۧ᩻;

    const/4 v2, 0x0

    invoke-direct {v1, v8, v2, v0}, Ll/ܿۧ᩻;-><init>(IILjava/lang/String;)V

    .line 96
    throw v1

    :cond_17
    const/4 v0, 0x0

    .line 89
    invoke-virtual {v6, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 316
    new-instance v2, Ll/ܿۧ᩻;

    invoke-direct {v2, v8, v0, v1}, Ll/ܿۧ᩻;-><init>(IILjava/lang/String;)V

    .line 89
    throw v2

    :pswitch_2
    const/4 v0, 0x0

    if-eqz v6, :cond_19

    .line 83
    iget v1, v6, Ll/ۨۧ᩻;->᩷:I

    const/16 v3, 0x80

    if-ge v1, v3, :cond_18

    goto :goto_a

    :cond_18
    new-instance v1, Ll/ܿۧ᩻;

    const-string v2, "Directive nesting limit exceeded"

    sget-object v3, Ll/᩶ۧ᩻;->᩶:Ll/᩶ۧ᩻;

    invoke-direct {v1, v8, v0, v2, v3}, Ll/ܿۧ᩻;-><init>(IILjava/lang/String;Ll/᩶ۧ᩻;)V

    throw v1

    .line 84
    :cond_19
    :goto_a
    new-instance v3, Ll/ۛۧ᩻;

    iget-object v1, v4, Ll/ܰۧ᩻;->ᩴ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-direct {v3, v7, v6}, Ll/ۛۧ᩻;-><init>(ILl/ۨۧ᩻;)V

    .line 85
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    new-instance v1, Ll/ۨۧ᩻;

    invoke-direct {v1, v3, v0}, Ll/ۨۧ᩻;-><init>(Ll/ۛۧ᩻;I)V

    .line 103
    :goto_b
    new-instance v0, Ll/᩺ۧ᩻;

    new-instance v7, Ll/ܿ۫ܺ;

    invoke-direct {v7, v5, v12, v9}, Ll/ܿ۫ܺ;-><init>(IILjava/lang/CharSequence;)V

    invoke-direct {v0, v5, v7, v6, v2}, Ll/᩺ۧ᩻;-><init>(ILl/ܿ۫ܺ;Ll/ۨۧ᩻;Ljava/lang/String;)V

    move/from16 v13, p3

    move/from16 v5, v17

    .line 104
    invoke-static {v13, v5, v9}, Ll/ᩳۚۤ;->ۙ(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Ll/᩺ۧ᩻;->ۤ:Ljava/lang/String;

    .line 105
    iput-object v3, v0, Ll/᩺ۧ᩻;->ᩴ:Ll/ۛۧ᩻;

    .line 106
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v6, v1

    move v7, v12

    :cond_1a
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p4

    move v5, v12

    goto/16 :goto_0

    :cond_1b
    if-nez v6, :cond_1e

    .line 112
    new-instance v0, Ll/᩺ۧ᩻;

    new-instance v1, Ll/ܿ۫ܺ;

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-direct {v1, v7, v2, v9}, Ll/ܿ۫ܺ;-><init>(IILjava/lang/CharSequence;)V

    const/4 v2, 0x0

    invoke-direct {v0, v7, v1, v2, v2}, Ll/᩺ۧ᩻;-><init>(ILl/ܿ۫ܺ;Ll/ۨۧ᩻;Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    :goto_c
    iget-object v0, v4, Ll/ܰۧ᩻;->ܳ:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0, v9, v1}, Ll/ᩳۚۤ;->ۙ(Ljava/lang/String;Ljava/lang/CharSequence;I)I

    move-result v0

    if-ltz v0, :cond_1c

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v4, Ll/ܰۧ᩻;->ܳ:Ljava/lang/String;

    const-string v2, "_"

    .line 0
    invoke-static {v0, v1, v2}, Ll/۠᩹ᩴ;->ۙ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 114
    iput-object v0, v4, Ll/ܰۧ᩻;->ܳ:Ljava/lang/String;

    goto :goto_c

    .line 46
    :cond_1c
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1d

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p4

    .line 47
    invoke-static {v0, v1, v2, v3}, Ll/ᩳۧ᩻;->ۙ(Ljava/lang/CharSequence;ZILl/ۤ᩻ᩴ;)V

    return-void

    :cond_1d
    move-object/from16 v3, p4

    .line 51
    invoke-virtual/range {p4 .. p4}, Ll/ۤ᩻ᩴ;->ۙ()Ll/ۤ᩻ᩴ;

    move-result-object v1

    .line 52
    :try_start_0
    iput-object v1, v4, Ll/ܰۧ᩻;->᩷:Ll/ۤ᩻ᩴ;

    .line 53
    invoke-direct {v4, v3}, Ll/ܰۧ᩻;->ۙ(Ll/ۤ᩻ᩴ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    invoke-virtual {v1}, Ll/ۤ᩻ᩴ;->close()V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 51
    :try_start_1
    invoke-virtual {v1}, Ll/ۤ᩻ᩴ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_d

    :catchall_1
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_d
    throw v2

    .line 316
    :cond_1e
    new-instance v0, Ll/ܿۧ᩻;

    const-string v1, "Unclosed #if block"

    const/4 v2, 0x0

    invoke-direct {v0, v8, v2, v1}, Ll/ܿۧ᩻;-><init>(IILjava/lang/String;)V

    .line 111
    throw v0

    :sswitch_data_0
    .sparse-switch
        0xd1d -> :sswitch_4
        0x2f8c04 -> :sswitch_3
        0x2f8d39 -> :sswitch_2
        0x5c2cb38 -> :sswitch_1
        0x5c4d208 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        0xd1d -> :sswitch_8
        0x2f8c04 -> :sswitch_7
        0x2f8d39 -> :sswitch_6
        0x5c2cb38 -> :sswitch_5
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private ۙ(Ll/ۤ᩻ᩴ;)V
    .locals 14

    .line 129
    iget-object v0, p0, Ll/ܰۧ᩻;->ᩴ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v2, v1, [I

    .line 130
    invoke-direct {p0, v2}, Ll/ܰۧ᩻;->ۙ([I)V

    .line 132
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛۧ᩻;

    const/4 v6, 0x0

    .line 133
    :goto_0
    iget v7, v4, Ll/ۛۧ᩻;->ۙ:I

    if-ge v6, v7, :cond_2

    invoke-direct {p0}, Ll/ܰۧ᩻;->᩷()Z

    move-result v7

    if-eqz v7, :cond_2

    .line 134
    invoke-static {v2, v5}, Ljava/util/Arrays;->fill([II)V

    .line 135
    iget v7, v4, Ll/ۛۧ᩻;->᩸:I

    aput v6, v2, v7

    .line 136
    iget-object v7, v4, Ll/ۛۧ᩻;->ᩴ:Ll/ۨۧ᩻;

    :goto_1
    if-eqz v7, :cond_1

    .line 137
    iget-object v8, v7, Ll/ۨۧ᩻;->ۤ:Ll/ۛۧ᩻;

    iget v9, v8, Ll/ۛۧ᩻;->᩸:I

    iget v7, v7, Ll/ۨۧ᩻;->ۙ:I

    aput v7, v2, v9

    .line 136
    iget-object v7, v8, Ll/ۛۧ᩻;->ᩴ:Ll/ۨۧ᩻;

    goto :goto_1

    .line 139
    :cond_1
    invoke-direct {p0, v2}, Ll/ܰۧ᩻;->ۙ([I)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 141
    :cond_2
    invoke-direct {p0}, Ll/ܰۧ᩻;->᩷()Z

    move-result v4

    if-nez v4, :cond_0

    .line 144
    :cond_3
    invoke-static {v2, v5}, Ljava/util/Arrays;->fill([II)V

    .line 145
    :goto_2
    invoke-direct {p0}, Ll/ܰۧ᩻;->᩷()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_5

    add-int/lit8 v3, v1, -0x1

    :goto_3
    if-ltz v3, :cond_5

    .line 286
    aget v6, v2, v3

    add-int/2addr v6, v4

    aput v6, v2, v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۛۧ᩻;

    iget v7, v7, Ll/ۛۧ᩻;->ۙ:I

    if-ge v6, v7, :cond_4

    .line 145
    invoke-direct {p0, v2}, Ll/ܰۧ᩻;->ۙ([I)V

    goto :goto_2

    .line 287
    :cond_4
    aput v5, v2, v3

    add-int/lit8 v3, v3, -0x1

    goto :goto_3

    .line 146
    :cond_5
    iget-boolean v1, p0, Ll/ܰۧ᩻;->ۧ:Z

    iget-object v2, p0, Ll/ܰۧ᩻;->ۚ:Ljava/util/ArrayList;

    if-eqz v1, :cond_10

    .line 234
    iget-object v1, p0, Ll/ܰۧ᩻;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    const v5, 0x7fffffff

    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۘۧ᩻;

    const/4 v7, 0x0

    .line 236
    :goto_4
    invoke-static {v6}, Ll/ۘۧ᩻;->ۤ(Ll/ۘۧ᩻;)I

    move-result v8

    if-gt v7, v8, :cond_6

    .line 237
    invoke-static {}, Ll/ܰۧ᩻;->ۙ()V

    .line 238
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩺ۧ᩻;

    .line 239
    iget-object v9, v8, Ll/᩺ۧ᩻;->᩷:Ljava/lang/String;

    if-nez v9, :cond_d

    iget-object v9, v8, Ll/᩺ۧ᩻;->۫:Ll/ܿ۫ܺ;

    invoke-virtual {v9}, Ll/ܿ۫ܺ;->length()I

    move-result v9

    if-eqz v9, :cond_d

    iget-object v9, v8, Ll/᩺ۧ᩻;->᩸:Ll/ܿ۫ܺ;

    if-nez v9, :cond_d

    iget-object v8, v8, Ll/᩺ۧ᩻;->ۙ:Ll/ۨۧ᩻;

    invoke-static {v6}, Ll/ۘۧ᩻;->ۙ(Ll/ۘۧ᩻;)[I

    move-result-object v9

    .line 240
    invoke-static {v8, v9}, Ll/ܰۧ᩻;->ۙ(Ll/ۨۧ᩻;[I)Z

    move-result v8

    if-eqz v8, :cond_d

    if-nez v3, :cond_7

    move-object v3, v6

    .line 248
    :cond_7
    iget-object v7, p0, Ll/ܰۧ᩻;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_8
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [I

    .line 250
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v10, 0x0

    :cond_9
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_b

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۛۧ᩻;

    .line 251
    invoke-static {}, Ll/ܰۧ᩻;->ۙ()V

    .line 252
    iget-object v12, v11, Ll/ۛۧ᩻;->ᩴ:Ll/ۨۧ᩻;

    invoke-static {v6}, Ll/ۘۧ᩻;->ۙ(Ll/ۘۧ᩻;)[I

    move-result-object v13

    invoke-static {v12, v13}, Ll/ܰۧ᩻;->ۙ(Ll/ۨۧ᩻;[I)Z

    move-result v12

    .line 253
    iget-object v13, v11, Ll/ۛۧ᩻;->ᩴ:Ll/ۨۧ᩻;

    invoke-static {v13, v8}, Ll/ܰۧ᩻;->ۙ(Ll/ۨۧ᩻;[I)Z

    move-result v13

    if-ne v12, v13, :cond_a

    if-eqz v12, :cond_9

    .line 255
    invoke-static {v6}, Ll/ۘۧ᩻;->ۙ(Ll/ۘۧ᩻;)[I

    move-result-object v12

    iget v11, v11, Ll/ۛۧ᩻;->᩸:I

    aget v12, v12, v11

    aget v11, v8, v11

    if-eq v12, v11, :cond_9

    :cond_a
    add-int/lit8 v10, v10, 0x1

    if-lt v10, v5, :cond_9

    :cond_b
    if-ge v10, v5, :cond_8

    move-object v3, v6

    move v5, v10

    goto :goto_5

    :cond_c
    if-ne v5, v4, :cond_6

    goto :goto_6

    :cond_d
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_4

    :cond_e
    :goto_6
    if-nez v3, :cond_f

    goto :goto_7

    .line 267
    :cond_f
    invoke-static {v3}, Ll/ۘۧ᩻;->᩷(Ll/ۘۧ᩻;)Ll/ۚ᩸᩻;

    move-result-object p1

    throw p1

    .line 147
    :cond_10
    :goto_7
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_11
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺ۧ᩻;

    .line 148
    iget-object v2, v1, Ll/᩺ۧ᩻;->᩷:Ljava/lang/String;

    iget-object v3, v1, Ll/᩺ۧ᩻;->۫:Ll/ܿ۫ܺ;

    if-nez v2, :cond_13

    .line 149
    iget-object v1, v1, Ll/᩺ۧ᩻;->᩸:Ll/ܿ۫ܺ;

    if-nez v1, :cond_12

    goto :goto_9

    :cond_12
    move-object v3, v1

    :goto_9
    invoke-virtual {p1, v3}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    goto :goto_8

    .line 151
    :cond_13
    iget-object v2, v1, Ll/᩺ۧ᩻;->ᩴ:Ll/ۛۧ᩻;

    if-nez v2, :cond_14

    iget-object v2, v1, Ll/᩺ۧ᩻;->ܳ:Ljava/lang/String;

    goto :goto_a

    :cond_14
    iget-object v2, v2, Ll/ۛۧ᩻;->ۤ:Ljava/lang/String;

    :goto_a
    if-nez v2, :cond_15

    .line 153
    invoke-virtual {p1, v3}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    goto :goto_8

    .line 155
    :cond_15
    invoke-virtual {p1, v2}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    move-result-object v2

    iget-object v1, v1, Ll/᩺ۧ᩻;->ۤ:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    .line 312
    invoke-virtual {v3}, Ll/ܿ۫ܺ;->length()I

    move-result v1

    if-eqz v1, :cond_11

    invoke-virtual {v3}, Ll/ܿ۫ܺ;->length()I

    move-result v1

    sub-int/2addr v1, v4

    invoke-virtual {v3, v1}, Ll/ܿ۫ܺ;->charAt(I)C

    move-result v1

    const/16 v2, 0xd

    if-eq v1, v2, :cond_16

    const/16 v2, 0xa

    if-ne v1, v2, :cond_11

    .line 156
    :cond_16
    iget-object v1, p0, Ll/ܰۧ᩻;->۫:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    goto :goto_8

    :cond_17
    return-void
.end method

.method private ۙ(Ll/ۤ᩻ᩴ;[I[ILl/ܿۧ᩻;)V
    .locals 4

    .line 216
    invoke-virtual {p4}, Ll/ܿۧ᩻;->᩷()I

    move-result v0

    invoke-virtual {p4}, Ll/ܿۧ᩻;->ۙ()I

    move-result v1

    const/4 v2, 0x1

    invoke-static {p1, v0, v1, v2}, Ll/ۢۚ᩻;->ۙ(Ljava/lang/CharSequence;IIZ)I

    move-result p1

    .line 217
    iget-object v0, p0, Ll/ܰۧ᩻;->ۚ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v2

    :goto_0
    if-ltz v1, :cond_3

    .line 218
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺ۧ᩻;

    .line 219
    aget v3, p2, v1

    if-ltz v3, :cond_2

    if-gt v3, p1, :cond_2

    iget-object v3, v2, Ll/᩺ۧ᩻;->۫:Ll/ܿ۫ܺ;

    invoke-virtual {v3}, Ll/ܿ۫ܺ;->length()I

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    .line 220
    :cond_0
    iget v3, v2, Ll/᩺ۧ᩻;->ۚ:I

    iget-object v2, v2, Ll/᩺ۧ᩻;->۫:Ll/ܿ۫ܺ;

    .line 221
    invoke-virtual {v2}, Ll/ܿ۫ܺ;->length()I

    move-result v2

    aget p2, p2, v1

    sub-int/2addr p1, p2

    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    add-int/2addr p1, v3

    invoke-virtual {p4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    .line 220
    iget-object v2, p0, Ll/ܰۧ᩻;->֫:Ljava/lang/CharSequence;

    invoke-static {p2, v2, p1}, Ll/ۢۚ᩻;->ۙ(Ljava/lang/String;Ljava/lang/CharSequence;I)Ll/ۚ᩸᩻;

    move-result-object p1

    .line 224
    invoke-virtual {p4}, Ll/ܿۧ᩻;->᩸()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    add-int/lit8 v1, p2, -0x1

    .line 225
    :cond_1
    new-instance p2, Ll/ۘۧ᩻;

    invoke-direct {p2, p3, v1, p1}, Ll/ۘۧ᩻;-><init>([IILl/ۚ᩸᩻;)V

    iget-object p1, p0, Ll/ܰۧ᩻;->᩸:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method private ۙ(Ll/᩺ۧ᩻;[ILl/ۤ᩻ᩴ;II)V
    .locals 1

    .line 271
    iget-object v0, p1, Ll/᩺ۧ᩻;->᩸:Ll/ܿ۫ܺ;

    if-nez v0, :cond_0

    iget-object v0, p1, Ll/᩺ۧ᩻;->ۙ:Ll/ۨۧ᩻;

    invoke-static {v0, p2}, Ll/ܰۧ᩻;->ۙ(Ll/ۨۧ᩻;[I)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 272
    iget-object p2, p0, Ll/ܰۧ᩻;->᩷:Ll/ۤ᩻ᩴ;

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    .line 273
    iget-object v0, p0, Ll/ܰۧ᩻;->᩷:Ll/ۤ᩻ᩴ;

    invoke-virtual {v0, p4, p5, p3}, Ll/ۤ᩻ᩴ;->ۙ(IILjava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    .line 274
    new-instance p3, Ll/ܿ۫ܺ;

    iget-object p4, p0, Ll/ܰۧ᩻;->᩷:Ll/ۤ᩻ᩴ;

    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    move-result p5

    invoke-direct {p3, p2, p5, p4}, Ll/ܿ۫ܺ;-><init>(IILjava/lang/CharSequence;)V

    iput-object p3, p1, Ll/᩺ۧ᩻;->᩸:Ll/ܿ۫ܺ;

    :cond_0
    return-void
.end method

.method private ۙ([I)V
    .locals 19

    move-object/from16 v7, p0

    move-object/from16 v0, p1

    .line 164
    invoke-static {}, Ll/ܰۧ᩻;->ۙ()V

    .line 165
    invoke-direct/range {p0 .. p0}, Ll/ܰۧ᩻;->᩷()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 166
    :cond_0
    iget-object v1, v7, Ll/ܰۧ᩻;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [I

    invoke-static {v3, v0}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_0
    return-void

    .line 167
    :cond_2
    invoke-virtual/range {p1 .. p1}, [I->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [I

    .line 168
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    iget-object v1, v7, Ll/ܰۧ᩻;->᩷:Ll/ۤ᩻ᩴ;

    invoke-virtual {v1}, Ll/ۤ᩻ᩴ;->ۙ()Ll/ۤ᩻ᩴ;

    move-result-object v8

    :try_start_0
    iget-object v1, v7, Ll/ܰۧ᩻;->᩷:Ll/ۤ᩻ᩴ;

    invoke-virtual {v1}, Ll/ۤ᩻ᩴ;->ۙ()Ll/ۤ᩻ᩴ;

    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 170
    iget-boolean v1, v7, Ll/ܰۧ᩻;->ۧ:Z

    iget-object v10, v7, Ll/ܰۧ᩻;->ۚ:Ljava/util/ArrayList;

    if-eqz v1, :cond_3

    :try_start_1
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v3

    new-array v3, v3, [I

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_a

    :cond_3
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_4

    const/4 v4, -0x1

    .line 171
    invoke-static {v3, v4}, Ljava/util/Arrays;->fill([II)V

    :cond_4
    const/4 v4, 0x0

    .line 172
    :goto_2
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v11, "__"

    const/16 v12, 0xa

    const/16 v13, 0xd

    const/4 v14, 0x1

    if-ge v4, v5, :cond_a

    .line 173
    :try_start_2
    invoke-static {}, Ll/ܰۧ᩻;->ۙ()V

    .line 174
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩺ۧ᩻;

    .line 175
    iget-object v6, v5, Ll/᩺ۧ᩻;->᩷:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v15, v5, Ll/᩺ۧ᩻;->۫:Ll/ܿ۫ܺ;

    if-eqz v6, :cond_7

    .line 293
    :try_start_3
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v7, Ll/ܰۧ᩻;->ܳ:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 176
    invoke-virtual {v8, v5}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    .line 312
    invoke-virtual {v15}, Ll/ܿ۫ܺ;->length()I

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v15}, Ll/ܿ۫ܺ;->length()I

    move-result v5

    sub-int/2addr v5, v14

    invoke-virtual {v15, v5}, Ll/ܿ۫ܺ;->charAt(I)C

    move-result v5

    if-eq v5, v13, :cond_6

    if-ne v5, v12, :cond_5

    goto :goto_3

    :cond_5
    const/4 v14, 0x0

    :cond_6
    :goto_3
    if-eqz v14, :cond_9

    .line 177
    iget-object v5, v7, Ll/ܰۧ᩻;->۫:Ljava/lang/String;

    invoke-virtual {v8, v5}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    goto :goto_4

    .line 178
    :cond_7
    iget-object v5, v5, Ll/᩺ۧ᩻;->ۙ:Ll/ۨۧ᩻;

    invoke-static {v5, v0}, Ll/ܰۧ᩻;->ۙ(Ll/ۨۧ᩻;[I)Z

    move-result v5

    if-eqz v5, :cond_9

    if-eqz v3, :cond_8

    .line 179
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v5

    aput v5, v3, v4

    .line 180
    :cond_8
    invoke-virtual {v8, v15}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_9
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 184
    :cond_a
    :try_start_4
    iget-boolean v4, v7, Ll/ܰۧ᩻;->ܽ:Z

    iget v5, v7, Ll/ܰۧ᩻;->ܺ:I

    invoke-static {v8, v4, v5, v9}, Ll/ᩳۧ᩻;->ۙ(Ljava/lang/CharSequence;ZILl/ۤ᩻ᩴ;)V
    :try_end_4
    .catch Ll/ܿۧ᩻; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v1, :cond_b

    .line 191
    :try_start_5
    iget-object v1, v7, Ll/ܰۧ᩻;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v5, 0x0

    const/4 v15, 0x1

    .line 193
    :goto_5
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v15, v1, :cond_13

    .line 194
    invoke-static {}, Ll/ܰۧ᩻;->ۙ()V

    .line 195
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ll/᩺ۧ᩻;

    .line 293
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v7, Ll/ܰۧ᩻;->ܳ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 197
    invoke-static {v4, v9, v5}, Ll/ᩳۚۤ;->ۙ(Ljava/lang/String;Ljava/lang/CharSequence;I)I

    move-result v3

    move v2, v3

    :goto_6
    if-le v2, v5, :cond_e

    add-int/lit8 v1, v2, -0x1

    .line 199
    invoke-interface {v9, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    if-eq v1, v13, :cond_d

    if-ne v1, v12, :cond_c

    goto :goto_7

    :cond_c
    const/4 v1, 0x0

    goto :goto_8

    :cond_d
    :goto_7
    const/4 v1, 0x1

    :goto_8
    if-nez v1, :cond_e

    add-int/lit8 v2, v2, -0x1

    goto :goto_6

    :cond_e
    add-int/lit8 v1, v15, -0x1

    .line 200
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Ll/᩺ۧ᩻;

    move-object/from16 v1, p0

    move/from16 v17, v2

    move-object/from16 v2, v16

    move v14, v3

    move-object/from16 v3, p1

    move-object/from16 v18, v4

    move-object v4, v9

    move-object v12, v6

    move/from16 v6, v17

    invoke-direct/range {v1 .. v6}, Ll/ܰۧ᩻;->ۙ(Ll/᩺ۧ᩻;[ILl/ۤ᩻ᩴ;II)V

    .line 201
    iget-object v1, v12, Ll/᩺ۧ᩻;->ۙ:Ll/ۨۧ᩻;

    invoke-static {v1, v0}, Ll/ܰۧ᩻;->ۙ(Ll/ۨۧ᩻;[I)Z

    move-result v1

    if-eqz v1, :cond_f

    iget-object v1, v12, Ll/᩺ۧ᩻;->ܳ:Ljava/lang/String;

    if-nez v1, :cond_f

    move/from16 v2, v17

    .line 202
    invoke-static {v2, v14, v9}, Ll/ᩳۚۤ;->ۙ(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v12, Ll/᩺ۧ᩻;->ܳ:Ljava/lang/String;

    .line 203
    iget-object v1, v12, Ll/᩺ۧ᩻;->᩷:Ljava/lang/String;

    const-string v2, "if"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    iget-object v1, v12, Ll/᩺ۧ᩻;->ᩴ:Ll/ۛۧ᩻;

    iget-object v2, v1, Ll/ۛۧ᩻;->ۤ:Ljava/lang/String;

    if-nez v2, :cond_f

    .line 204
    iget-object v2, v12, Ll/᩺ۧ᩻;->ܳ:Ljava/lang/String;

    iput-object v2, v1, Ll/ۛۧ᩻;->ۤ:Ljava/lang/String;

    .line 207
    :cond_f
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v1

    add-int v3, v14, v1

    .line 208
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge v3, v1, :cond_10

    invoke-interface {v9, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    if-ne v1, v13, :cond_10

    add-int/lit8 v3, v3, 0x1

    .line 209
    :cond_10
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge v3, v1, :cond_11

    invoke-interface {v9, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_12

    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_11
    const/16 v2, 0xa

    :cond_12
    :goto_9
    move v5, v3

    add-int/lit8 v15, v15, 0x2

    const/16 v12, 0xa

    const/4 v14, 0x1

    goto/16 :goto_5

    .line 211
    :cond_13
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ll/᩺ۧ᩻;

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v6

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object v4, v9

    invoke-direct/range {v1 .. v6}, Ll/ܰۧ᩻;->ۙ(Ll/᩺ۧ᩻;[ILl/ۤ᩻ᩴ;II)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 212
    :try_start_6
    invoke-virtual {v9}, Ll/ۤ᩻ᩴ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    invoke-virtual {v8}, Ll/ۤ᩻ᩴ;->close()V

    return-void

    :catch_0
    move-exception v0

    .line 186
    :try_start_7
    invoke-virtual {v0}, Ll/ܿۧ᩻;->ۤ()Z

    move-result v4

    if-nez v4, :cond_15

    if-eqz v1, :cond_14

    .line 188
    invoke-direct {v7, v8, v3, v2, v0}, Ll/ܰۧ᩻;->ۙ(Ll/ۤ᩻ᩴ;[I[ILl/ܿۧ᩻;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 212
    :cond_14
    :try_start_8
    invoke-virtual {v9}, Ll/ۤ᩻ᩴ;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    invoke-virtual {v8}, Ll/ۤ᩻ᩴ;->close()V

    return-void

    .line 186
    :cond_15
    :try_start_9
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :goto_a
    move-object v1, v0

    .line 169
    :try_start_a
    invoke-virtual {v9}, Ll/ۤ᩻ᩴ;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    goto :goto_b

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_b
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_b
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    :catchall_2
    move-exception v0

    move-object v1, v0

    :try_start_c
    invoke-virtual {v8}, Ll/ۤ᩻ᩴ;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    goto :goto_c

    :catchall_3
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_c
    throw v1
.end method

.method public static ۙ(Ll/ۨۧ᩻;[I)Z
    .locals 2

    :goto_0
    if-eqz p0, :cond_1

    .line 298
    iget-object v0, p0, Ll/ۨۧ᩻;->ۤ:Ll/ۛۧ᩻;

    iget v1, v0, Ll/ۛۧ᩻;->᩸:I

    aget v1, p1, v1

    iget p0, p0, Ll/ۨۧ᩻;->ۙ:I

    if-eq v1, p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 297
    :cond_0
    iget-object p0, v0, Ll/ۛۧ᩻;->ᩴ:Ll/ۨۧ᩻;

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method private ᩷()Z
    .locals 8

    .line 280
    iget-object v0, p0, Ll/ܰۧ᩻;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    int-to-long v0, v0

    iget-wide v2, p0, Ll/ܰۧ᩻;->ۤ:J

    const-wide/16 v4, 0x1

    .line 281
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    const-wide/32 v6, 0x800000

    div-long/2addr v6, v2

    const-wide/16 v2, 0x40

    .line 280
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
