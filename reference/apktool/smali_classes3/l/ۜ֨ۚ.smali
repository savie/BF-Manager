.class public final Ll/ۜ֨ۚ;
.super Ljava/lang/Object;
.source "V6KB"

# interfaces
.implements Ll/۬֫ܶ;
.implements Ll/۫֫᩷;


# static fields
.field public static ֡:I = -0x1

.field public static ۟:Z

.field public static ۢ:I

.field public static ܰ:I

.field public static ܿ:I

.field public static ᩳ:I

.field public static ᩶:J


# direct methods
.method public static ֫(I)V
    .locals 0

    .line 45
    sput p0, Ll/ۜ֨ۚ;->ᩳ:I

    return-void
.end method

.method public static ֫()Z
    .locals 2

    .line 77
    sget v0, Ll/ۜ֨ۚ;->֡:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static ۙ()I
    .locals 1

    .line 25
    sget v0, Ll/ۜ֨ۚ;->ܰ:I

    return v0
.end method

.method public static ۙ(CLjava/lang/CharSequence;I)I
    .locals 2

    .line 7
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    :goto_0
    if-ge p2, v0, :cond_1

    .line 9
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    if-ne v1, p0, :cond_0

    return p2

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static ۙ(IILjava/lang/CharSequence;)I
    .locals 2

    :goto_0
    if-ge p0, p1, :cond_1

    .line 135
    invoke-interface {p2, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_0

    return p0

    :cond_0
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_1
    return p1
.end method

.method public static ۙ(Ljava/lang/String;)I
    .locals 10

    .line 144
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_19

    const/4 v0, 0x0

    .line 150
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x72

    const/16 v3, 0x2d

    const/4 v4, 0x1

    if-ne v1, v2, :cond_0

    const/16 v0, 0x100

    goto :goto_0

    :cond_0
    if-eq v1, v3, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 156
    :goto_1
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x77

    if-ne v5, v6, :cond_2

    or-int/lit16 v0, v0, 0x80

    goto :goto_2

    :cond_2
    if-eq v5, v3, :cond_3

    const/4 v1, 0x1

    :cond_3
    :goto_2
    const/4 v5, 0x2

    .line 162
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v7, 0x53

    const/16 v8, 0x73

    const/16 v9, 0x78

    if-ne v5, v8, :cond_4

    or-int/lit16 v0, v0, 0x840

    goto :goto_3

    :cond_4
    if-ne v5, v7, :cond_5

    or-int/lit16 v0, v0, 0x800

    goto :goto_3

    :cond_5
    if-ne v5, v9, :cond_6

    or-int/lit8 v0, v0, 0x40

    goto :goto_3

    :cond_6
    if-eq v5, v3, :cond_7

    const/4 v1, 0x1

    :cond_7
    :goto_3
    const/4 v5, 0x3

    .line 174
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ne v5, v2, :cond_8

    or-int/lit8 v0, v0, 0x20

    goto :goto_4

    :cond_8
    if-eq v5, v3, :cond_9

    const/4 v1, 0x1

    :cond_9
    :goto_4
    const/4 v5, 0x4

    .line 180
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ne v5, v6, :cond_a

    or-int/lit8 v0, v0, 0x10

    goto :goto_5

    :cond_a
    if-eq v5, v3, :cond_b

    const/4 v1, 0x1

    :cond_b
    :goto_5
    const/4 v5, 0x5

    .line 186
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ne v5, v8, :cond_c

    or-int/lit16 v0, v0, 0x408

    goto :goto_6

    :cond_c
    if-ne v5, v7, :cond_d

    or-int/lit16 v0, v0, 0x400

    goto :goto_6

    :cond_d
    if-ne v5, v9, :cond_e

    or-int/lit8 v0, v0, 0x8

    goto :goto_6

    :cond_e
    if-eq v5, v3, :cond_f

    const/4 v1, 0x1

    :cond_f
    :goto_6
    const/4 v5, 0x6

    .line 198
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ne v5, v2, :cond_10

    or-int/lit8 v0, v0, 0x4

    goto :goto_7

    :cond_10
    if-eq v5, v3, :cond_11

    const/4 v1, 0x1

    :cond_11
    :goto_7
    const/4 v2, 0x7

    .line 204
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v6, :cond_12

    or-int/lit8 v0, v0, 0x2

    goto :goto_8

    :cond_12
    if-eq v2, v3, :cond_13

    const/4 v1, 0x1

    :cond_13
    :goto_8
    const/16 v2, 0x8

    .line 210
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v5, 0x74

    if-ne v2, v5, :cond_14

    or-int/lit16 v0, v0, 0x201

    goto :goto_9

    :cond_14
    const/16 v5, 0x54

    if-ne v2, v5, :cond_15

    or-int/lit16 v0, v0, 0x200

    goto :goto_9

    :cond_15
    if-ne v2, v9, :cond_16

    or-int/lit8 v0, v0, 0x1

    goto :goto_9

    :cond_16
    if-eq v2, v3, :cond_17

    goto :goto_a

    :cond_17
    :goto_9
    move v4, v1

    :goto_a
    if-nez v4, :cond_18

    return v0

    .line 223
    :cond_18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 145
    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۙ(J)V
    .locals 0

    .line 61
    sput-wide p0, Ll/ۜ֨ۚ;->᩶:J

    return-void
.end method

.method public static ۙ(Z)V
    .locals 0

    .line 69
    sput-boolean p0, Ll/ۜ֨ۚ;->۟:Z

    return-void
.end method

.method public static ۙ(I)Z
    .locals 2

    .line 62
    invoke-static {p0}, Ljava/lang/Character;->getType(I)I

    move-result v0

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x24

    if-eq p0, v0, :cond_0

    const/16 v0, 0x2b

    if-eq p0, v0, :cond_0

    const/16 v0, 0x5e

    if-eq p0, v0, :cond_0

    const/16 v0, 0x60

    if-eq p0, v0, :cond_0

    const/16 v0, 0x7c

    if-eq p0, v0, :cond_0

    const/16 v0, 0x7e

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_1

    const/4 p0, 0x0

    return p0

    :cond_0
    :pswitch_0
    return v1

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3c
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static ۙ(Ll/ۖۗܳ;)Z
    .locals 2

    if-eqz p0, :cond_0

    .line 10
    invoke-interface {p0}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ll/ۖۗܳ;->᩺ۙ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "video/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 11
    invoke-interface {p0}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩷᩸֫;->᩷(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۚ(I)V
    .locals 0

    .line 21
    sput p0, Ll/ۜ֨ۚ;->֡:I

    return-void
.end method

.method public static ۚ()Z
    .locals 1

    .line 81
    sget v0, Ll/ۜ֨ۚ;->֡:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static ۤ(I)C
    .locals 1

    const v0, 0xf000

    and-int/2addr p0, v0

    const/16 v0, 0x1000

    if-eq p0, v0, :cond_6

    const/16 v0, 0x2000

    if-eq p0, v0, :cond_5

    const/16 v0, 0x4000

    if-eq p0, v0, :cond_4

    const/16 v0, 0x6000

    if-eq p0, v0, :cond_3

    const v0, 0x8000

    if-eq p0, v0, :cond_2

    const v0, 0xa000

    if-eq p0, v0, :cond_1

    const v0, 0xc000

    if-eq p0, v0, :cond_0

    const/16 p0, 0x3f

    return p0

    :cond_0
    const/16 p0, 0x73

    return p0

    :cond_1
    const/16 p0, 0x6c

    return p0

    :cond_2
    const/16 p0, 0x2d

    return p0

    :cond_3
    const/16 p0, 0x62

    return p0

    :cond_4
    const/16 p0, 0x64

    return p0

    :cond_5
    const/16 p0, 0x63

    return p0

    :cond_6
    const/16 p0, 0x70

    return p0
.end method

.method public static ۤ()I
    .locals 1

    .line 33
    sget v0, Ll/ۜ֨ۚ;->ܿ:I

    return v0
.end method

.method public static ۧ(I)V
    .locals 0

    .line 53
    sput p0, Ll/ۜ֨ۚ;->ۢ:I

    return-void
.end method

.method public static ۧ()Z
    .locals 1

    .line 65
    sget-boolean v0, Ll/ۜ֨ۚ;->۟:Z

    return v0
.end method

.method public static ۫(I)V
    .locals 0

    .line 37
    sput p0, Ll/ۜ֨ۚ;->ܿ:I

    return-void
.end method

.method public static ۫()Z
    .locals 5

    .line 73
    sget-wide v0, Ll/ۜ֨ۚ;->᩶:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static ܳ(I)V
    .locals 0

    .line 29
    sput p0, Ll/ۜ֨ۚ;->ܰ:I

    return-void
.end method

.method public static ᩴ()I
    .locals 1

    .line 49
    sget v0, Ll/ۜ֨ۚ;->ۢ:I

    return v0
.end method

.method public static ᩴ(I)[Z
    .locals 14

    and-int/lit16 v0, p0, 0x100

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit16 v3, p0, 0x80

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    and-int/lit8 v4, p0, 0x40

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    and-int/lit8 v5, p0, 0x20

    if-eqz v5, :cond_3

    const/4 v5, 0x1

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    :goto_3
    and-int/lit8 v6, p0, 0x10

    if-eqz v6, :cond_4

    const/4 v6, 0x1

    goto :goto_4

    :cond_4
    const/4 v6, 0x0

    :goto_4
    and-int/lit8 v7, p0, 0x8

    if-eqz v7, :cond_5

    const/4 v7, 0x1

    goto :goto_5

    :cond_5
    const/4 v7, 0x0

    :goto_5
    and-int/lit8 v8, p0, 0x4

    if-eqz v8, :cond_6

    const/4 v8, 0x1

    goto :goto_6

    :cond_6
    const/4 v8, 0x0

    :goto_6
    and-int/lit8 v9, p0, 0x2

    if-eqz v9, :cond_7

    const/4 v9, 0x1

    goto :goto_7

    :cond_7
    const/4 v9, 0x0

    :goto_7
    and-int/lit8 v10, p0, 0x1

    if-eqz v10, :cond_8

    const/4 v10, 0x1

    goto :goto_8

    :cond_8
    const/4 v10, 0x0

    :goto_8
    and-int/lit16 v11, p0, 0x800

    if-eqz v11, :cond_9

    const/4 v11, 0x1

    goto :goto_9

    :cond_9
    const/4 v11, 0x0

    :goto_9
    and-int/lit16 v12, p0, 0x400

    if-eqz v12, :cond_a

    const/4 v12, 0x1

    goto :goto_a

    :cond_a
    const/4 v12, 0x0

    :goto_a
    and-int/lit16 p0, p0, 0x200

    if-eqz p0, :cond_b

    const/4 p0, 0x1

    goto :goto_b

    :cond_b
    const/4 p0, 0x0

    :goto_b
    const/16 v13, 0xc

    new-array v13, v13, [Z

    aput-boolean v0, v13, v1

    aput-boolean v3, v13, v2

    const/4 v0, 0x2

    aput-boolean v4, v13, v0

    const/4 v0, 0x3

    aput-boolean v5, v13, v0

    const/4 v0, 0x4

    aput-boolean v6, v13, v0

    const/4 v0, 0x5

    aput-boolean v7, v13, v0

    const/4 v0, 0x6

    aput-boolean v8, v13, v0

    const/4 v0, 0x7

    aput-boolean v9, v13, v0

    const/16 v0, 0x8

    aput-boolean v10, v13, v0

    const/16 v0, 0x9

    aput-boolean v11, v13, v0

    const/16 v0, 0xa

    aput-boolean v12, v13, v0

    const/16 v0, 0xb

    aput-boolean p0, v13, v0

    return-object v13
.end method

.method public static ᩷(IILjava/lang/CharSequence;)I
    .locals 2

    :goto_0
    if-lt p0, p1, :cond_1

    .line 148
    invoke-interface {p2, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_0

    return p0

    :cond_0
    add-int/lit8 p0, p0, -0x1

    goto :goto_0

    :cond_1
    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public static ᩷()J
    .locals 2

    .line 57
    sget-wide v0, Ll/ۜ֨ۚ;->᩶:J

    return-wide v0
.end method

.method public static ᩷(I)Z
    .locals 3

    const/16 v0, 0x9

    const/4 v1, 0x1

    if-eq p0, v0, :cond_1

    const/16 v0, 0xa

    if-eq p0, v0, :cond_1

    const/16 v0, 0xc

    if-eq p0, v0, :cond_1

    const/16 v2, 0xd

    if-eq p0, v2, :cond_1

    const/16 v2, 0x20

    if-eq p0, v2, :cond_1

    .line 111
    invoke-static {p0}, Ljava/lang/Character;->getType(I)I

    move-result p0

    if-ne p0, v0, :cond_0

    return v1

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    return v1
.end method

.method public static ᩸()I
    .locals 1

    .line 41
    sget v0, Ll/ۜ֨ۚ;->ᩳ:I

    return v0
.end method

.method public static ᩸(I)Ljava/lang/String;
    .locals 6

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    and-int/lit16 v1, p0, 0x100

    const/16 v2, 0x72

    const/16 v3, 0x2d

    if-eqz v1, :cond_0

    const/16 v1, 0x72

    goto :goto_0

    :cond_0
    const/16 v1, 0x2d

    .line 65
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit16 v1, p0, 0x80

    const/16 v4, 0x77

    if-eqz v1, :cond_1

    const/16 v1, 0x77

    goto :goto_1

    :cond_1
    const/16 v1, 0x2d

    .line 66
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit16 v1, p0, 0x800

    const/16 v5, 0x53

    if-eqz v1, :cond_3

    and-int/lit8 v1, p0, 0x40

    if-eqz v1, :cond_2

    const/16 v1, 0x73

    goto :goto_2

    :cond_2
    const/16 v1, 0x53

    .line 68
    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_3
    and-int/lit8 v1, p0, 0x40

    if-eqz v1, :cond_4

    const/16 v1, 0x78

    goto :goto_3

    :cond_4
    const/16 v1, 0x2d

    .line 70
    :goto_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_4
    and-int/lit8 v1, p0, 0x20

    if-eqz v1, :cond_5

    const/16 v1, 0x72

    goto :goto_5

    :cond_5
    const/16 v1, 0x2d

    .line 73
    :goto_5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v1, p0, 0x10

    if-eqz v1, :cond_6

    const/16 v1, 0x77

    goto :goto_6

    :cond_6
    const/16 v1, 0x2d

    .line 74
    :goto_6
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit16 v1, p0, 0x400

    if-eqz v1, :cond_8

    and-int/lit8 v1, p0, 0x8

    if-eqz v1, :cond_7

    const/16 v5, 0x73

    .line 76
    :cond_7
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_8

    :cond_8
    and-int/lit8 v1, p0, 0x8

    if-eqz v1, :cond_9

    const/16 v1, 0x78

    goto :goto_7

    :cond_9
    const/16 v1, 0x2d

    .line 78
    :goto_7
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_8
    and-int/lit8 v1, p0, 0x4

    if-eqz v1, :cond_a

    goto :goto_9

    :cond_a
    const/16 v2, 0x2d

    .line 81
    :goto_9
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v1, p0, 0x2

    if-eqz v1, :cond_b

    goto :goto_a

    :cond_b
    const/16 v4, 0x2d

    .line 82
    :goto_a
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit16 v1, p0, 0x200

    if-eqz v1, :cond_d

    and-int/lit8 p0, p0, 0x1

    if-eqz p0, :cond_c

    const/16 p0, 0x74

    goto :goto_b

    :cond_c
    const/16 p0, 0x54

    .line 84
    :goto_b
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_c

    :cond_d
    and-int/lit8 p0, p0, 0x1

    if-eqz p0, :cond_e

    const/16 v3, 0x78

    .line 86
    :cond_e
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 89
    :goto_c
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩻()V
    .locals 3

    const/4 v0, -0x1

    .line 85
    sput v0, Ll/ۜ֨ۚ;->֡:I

    const/4 v0, 0x0

    .line 86
    sput v0, Ll/ۜ֨ۚ;->ܰ:I

    .line 87
    sput v0, Ll/ۜ֨ۚ;->ܿ:I

    .line 88
    sput v0, Ll/ۜ֨ۚ;->ᩳ:I

    .line 89
    sput v0, Ll/ۜ֨ۚ;->ۢ:I

    const-wide/16 v1, 0x0

    .line 90
    sput-wide v1, Ll/ۜ֨ۚ;->᩶:J

    .line 91
    sput-boolean v0, Ll/ۜ֨ۚ;->۟:Z

    return-void
.end method


# virtual methods
.method public ۙ(II)Ll/᩷ۧ᩷;
    .locals 0

    .line 26
    new-instance p1, Ll/ۙ֫᩷;

    invoke-direct {p1}, Ll/ۙ֫᩷;-><init>()V

    return-object p1
.end method

.method public ۙ(Ll/ۡ֫᩷;)V
    .locals 0

    return-void
.end method

.method public ܳ()V
    .locals 0

    return-void
.end method
