.class public final Ll/ۡ᩸᩻;
.super Ljava/lang/Object;
.source "K6OY"


# direct methods
.method public static ۙ(Ljava/lang/CharSequence;Ll/۫᩸᩻;Ll/ۧ᩸᩻;Ll/֫᩸᩻;ZLl/ۤ᩻ᩴ;)V
    .locals 13

    move-object v0, p0

    const-string v9, "Source nesting exceeds formatter limit"

    .line 31
    :try_start_0
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 32
    new-instance v1, Ll/᩹᩸᩻;

    new-instance v2, Ll/ᩳۚ᩻;

    invoke-direct {v2, p0}, Ll/ᩳۚ᩻;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v1, v2}, Ll/᩹᩸᩻;-><init>(Ll/ᩳۚ᩻;)V

    .line 33
    invoke-virtual {v1}, Ll/ۡܺۨ;->ۧ()V

    .line 34
    invoke-virtual {p1}, Ll/۫᩸᩻;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ll/ۢۚ᩻;

    invoke-direct {v2, p0}, Ll/ۢۚ᩻;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    .line 35
    invoke-virtual {v1, v2}, Ll/ۡܺۨ;->ۙ(Ll/᩻ܺۨ;)V

    .line 36
    :cond_1
    new-instance v3, Ll/֨᩸᩻;

    .line 78
    invoke-direct {v3, v1}, Ll/ۗܺۨ;-><init>(Ll/ܰܺۨ;)V

    .line 37
    invoke-virtual {v3}, Ll/ۗܺۨ;->ۤ()V

    .line 39
    invoke-virtual {v3}, Ll/ۗܺۨ;->᩸()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x3

    const/4 v8, 0x2

    if-eqz v6, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۠ܺۨ;

    .line 40
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 41
    invoke-interface {v6}, Ll/۠ܺۨ;->getType()I

    move-result v10

    if-eqz v2, :cond_5

    .line 43
    invoke-interface {v6}, Ll/۠ܺۨ;->᩸()I

    move-result v11

    invoke-interface {v6}, Ll/۠ܺۨ;->ᩴ()I

    move-result v6

    const/4 v12, 0x6

    if-ne v10, v12, :cond_3

    .line 44
    invoke-static {v11, v6, p0}, Ll/ۢۚ᩻;->ۙ(IILjava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_3

    const-string v6, "Unterminated CSS string"

    .line 45
    invoke-virtual {v2, v11, v6}, Ll/ۢۚ᩻;->ۙ(ILjava/lang/String;)V

    goto :goto_2

    :cond_3
    if-ne v10, v8, :cond_5

    sub-int v8, v6, v11

    if-lt v8, v7, :cond_4

    add-int/lit8 v7, v6, -0x1

    .line 47
    invoke-interface {p0, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    const/16 v8, 0x2a

    if-ne v7, v8, :cond_4

    invoke-interface {p0, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    const/16 v7, 0x2f

    if-eq v6, v7, :cond_5

    :cond_4
    const-string v6, "Unterminated CSS comment"

    .line 48
    invoke-virtual {v2, v11, v6}, Ll/ۢۚ᩻;->ۙ(ILjava/lang/String;)V

    :cond_5
    :goto_2
    const/16 v6, 0xf

    if-eq v10, v6, :cond_8

    const/16 v6, 0x13

    if-eq v10, v6, :cond_8

    const/16 v6, 0x8

    if-eq v10, v6, :cond_8

    const/16 v6, 0x11

    if-ne v10, v6, :cond_6

    goto :goto_3

    :cond_6
    const/16 v6, 0x10

    if-eq v10, v6, :cond_7

    const/16 v6, 0x14

    if-eq v10, v6, :cond_7

    const/16 v6, 0x12

    if-ne v10, v6, :cond_2

    :cond_7
    add-int/lit8 v5, v5, -0x1

    .line 54
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    goto :goto_1

    :cond_8
    :goto_3
    add-int/lit8 v5, v5, 0x1

    const/16 v6, 0x80

    if-gt v5, v6, :cond_9

    goto :goto_1

    .line 52
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 57
    :cond_a
    new-instance v1, Ll/ᩳ᩸᩻;

    invoke-direct {v1, v3}, Ll/ᩳ᩸᩻;-><init>(Ll/ۗܺۨ;)V

    .line 58
    invoke-virtual {v1}, Ll/ۡܺۨ;->ۧ()V

    if-eqz v2, :cond_b

    .line 59
    invoke-virtual {v1, v2}, Ll/ۡܺۨ;->ۙ(Ll/᩻ܺۨ;)V

    .line 60
    :cond_b
    sget-object v4, Ll/ۢ᩸᩻;->ۙ:[I

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    const/4 v5, 0x1

    if-eq v4, v5, :cond_e

    if-eq v4, v8, :cond_d

    if-ne v4, v7, :cond_c

    .line 63
    invoke-virtual {v1}, Ll/ᩳ᩸᩻;->֡()Ll/ۘ᩸᩻;

    move-result-object v1

    goto :goto_4

    .line 60
    :cond_c
    new-instance v0, Ljava/lang/IncompatibleClassChangeError;

    invoke-direct {v0}, Ljava/lang/IncompatibleClassChangeError;-><init>()V

    throw v0

    .line 62
    :cond_d
    invoke-virtual {v1}, Ll/ᩳ᩸᩻;->۟()Ll/ܰ᩸᩻;

    move-result-object v1

    goto :goto_4

    .line 61
    :cond_e
    invoke-virtual {v1}, Ll/ᩳ᩸᩻;->ۡ()Ll/۟᩸᩻;

    move-result-object v1

    :goto_4
    move-object v4, v1

    if-eqz v2, :cond_f

    .line 65
    invoke-virtual {v2}, Ll/ۢۚ᩻;->᩷()V

    .line 66
    :cond_f
    new-instance v10, Ll/ܶ᩸᩻;

    move-object v1, v10

    move-object v2, p0

    move-object v5, p1

    move-object v6, p2

    move/from16 v7, p4

    move-object/from16 v8, p5

    invoke-direct/range {v1 .. v8}, Ll/ܶ᩸᩻;-><init>(Ljava/lang/CharSequence;Ll/ۗܺۨ;Ll/۟ܺۨ;Ll/۫᩸᩻;Ll/ۧ᩸᩻;ZLl/ۤ᩻ᩴ;)V

    move-object/from16 v0, p3

    .line 67
    invoke-virtual {v10, v0}, Ll/ܶ᩸᩻;->ۙ(Ll/֫᩸᩻;)V

    .line 68
    invoke-virtual {v10}, Ll/ܶ᩸᩻;->ۙ()V
    :try_end_0
    .catch Ll/۟ۚ᩻; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 72
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v9, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 70
    :catch_1
    new-instance v0, Ljava/lang/InterruptedException;

    const-string v1, "Code transformation cancelled"

    invoke-direct {v0, v1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
