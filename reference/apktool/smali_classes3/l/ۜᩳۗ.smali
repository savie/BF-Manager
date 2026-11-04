.class public final Ll/ۜᩳۗ;
.super Ljava/lang/Object;
.source "36FV"


# instance fields
.field public final ۙ:Ljava/util/HashMap;

.field public final ۤ:Z

.field public final ᩷:Ll/۠ᩳۗ;


# direct methods
.method public constructor <init>(Ll/ۛۘۗ;)V
    .locals 2

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    new-instance v0, Ll/۠ᩳۗ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/۠ᩳۗ;-><init>(I)V

    iput-object v0, p0, Ll/ۜᩳۗ;->᩷:Ll/۠ᩳۗ;

    .line 67
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۜᩳۗ;->ۙ:Ljava/util/HashMap;

    .line 70
    invoke-virtual {p1}, Ll/ۛۘۗ;->᩷ۙ()Z

    move-result p1

    iput-boolean p1, p0, Ll/ۜᩳۗ;->ۤ:Z

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/᩻ۡۗ;Ljava/lang/Object;Z)Ll/ۘۡۗ;
    .locals 4

    .line 95
    iget-boolean v0, p0, Ll/ۜᩳۗ;->ۤ:Z

    if-nez v0, :cond_0

    goto :goto_2

    .line 98
    :cond_0
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    .line 99
    iget-object v1, p0, Ll/ۜᩳۗ;->᩷:Ll/۠ᩳۗ;

    invoke-virtual {v1, p2}, Ll/۠ᩳۗ;->ۙ(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    if-nez p3, :cond_1

    goto :goto_2

    :cond_1
    :goto_0
    if-eqz p1, :cond_5

    .line 105
    iget-object v3, p0, Ll/ۜᩳۗ;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۠ᩳۗ;

    if-eqz v3, :cond_3

    .line 107
    invoke-virtual {v3, p2}, Ll/۠ᩳۗ;->᩷(Ljava/lang/Object;)Ll/ۘۡۗ;

    move-result-object v3

    if-eqz v3, :cond_3

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    return-object v3

    .line 115
    :cond_3
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object p1

    invoke-virtual {p1}, Ll/֨ᩳۗ;->᩻()Ll/֨ᩳۗ;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_1

    .line 119
    :cond_4
    invoke-virtual {v0, p1}, Ll/֫ۖۗ;->ۙ(Ll/֨ᩳۗ;)Ll/᩻ۡۗ;

    move-result-object p1

    goto :goto_0

    :cond_5
    :goto_1
    if-eqz p3, :cond_6

    .line 122
    invoke-virtual {v1, p2}, Ll/۠ᩳۗ;->᩷(Ljava/lang/Object;)Ll/ۘۡۗ;

    move-result-object p1

    return-object p1

    :cond_6
    :goto_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۙ(Ll/᩻ۡۗ;Ll/᩹֨ۗ;)Ll/ۘۡۗ;
    .locals 8

    .line 128
    iget-boolean v0, p0, Ll/ۜᩳۗ;->ۤ:Z

    if-nez v0, :cond_0

    goto/16 :goto_8

    .line 131
    :cond_0
    invoke-virtual {p2}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫֨ۗ;->ܶ()Ll/ۨ֨ۗ;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_8

    .line 135
    :cond_1
    invoke-virtual {p2}, Ll/᩹֨ۗ;->ۧۙ()J

    move-result-wide v1

    .line 136
    sget-object p2, Ll/ۖᩳۗ;->ۙ:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p2, p2, v0

    const-wide/16 v3, 0xa

    const-wide/16 v5, 0x64

    const/4 v0, 0x1

    const/4 v7, 0x0

    packed-switch p2, :pswitch_data_0

    goto/16 :goto_8

    .line 153
    :pswitch_0
    invoke-static {v1, v2}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v1

    .line 154
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    const-wide/16 v3, 0x0

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, p1, p2, v0}, Ll/ۜᩳۗ;->ۙ(Ll/᩻ۡۗ;Ljava/lang/Object;Z)Ll/ۘۡۗ;

    move-result-object p1

    return-object p1

    :pswitch_1
    long-to-int p2, v1

    .line 150
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    .line 151
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p2, v2}, Ljava/lang/Float;->compare(FF)I

    move-result p2

    if-nez p2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0, p1, v1, v0}, Ll/ۜᩳۗ;->ۙ(Ll/᩻ۡۗ;Ljava/lang/Object;Z)Ll/ۘۡۗ;

    move-result-object p1

    return-object p1

    .line 148
    :pswitch_2
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    cmp-long v5, v1, v3

    if-lez v5, :cond_4

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {p0, p1, p2, v0}, Ll/ۜᩳۗ;->ۙ(Ll/᩻ۡۗ;Ljava/lang/Object;Z)Ll/ۘۡۗ;

    move-result-object p1

    return-object p1

    :pswitch_3
    long-to-int p2, v1

    .line 146
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    cmp-long v3, v1, v5

    if-lez v3, :cond_5

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    :goto_3
    invoke-virtual {p0, p1, p2, v0}, Ll/ۜᩳۗ;->ۙ(Ll/᩻ۡۗ;Ljava/lang/Object;Z)Ll/ۘۡۗ;

    move-result-object p1

    return-object p1

    :pswitch_4
    long-to-int p2, v1

    int-to-short p2, p2

    .line 144
    invoke-static {p2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p2

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    cmp-long v3, v1, v5

    if-lez v3, :cond_6

    goto :goto_4

    :cond_6
    const/4 v0, 0x0

    :goto_4
    invoke-virtual {p0, p1, p2, v0}, Ll/ۜᩳۗ;->ۙ(Ll/᩻ۡۗ;Ljava/lang/Object;Z)Ll/ۘۡۗ;

    move-result-object p1

    return-object p1

    :pswitch_5
    long-to-int p2, v1

    int-to-byte p2, p2

    .line 142
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p2

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    cmp-long v5, v1, v3

    if-lez v5, :cond_7

    goto :goto_5

    :cond_7
    const/4 v0, 0x0

    :goto_5
    invoke-virtual {p0, p1, p2, v0}, Ll/ۜᩳۗ;->ۙ(Ll/᩻ۡۗ;Ljava/lang/Object;Z)Ll/ۘۡۗ;

    move-result-object p1

    return-object p1

    :pswitch_6
    long-to-int p2, v1

    int-to-char p2, p2

    .line 140
    invoke-static {p2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p2

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    cmp-long v5, v1, v3

    if-lez v5, :cond_8

    goto :goto_6

    :cond_8
    const/4 v0, 0x0

    :goto_6
    invoke-virtual {p0, p1, p2, v0}, Ll/ۜᩳۗ;->ۙ(Ll/᩻ۡۗ;Ljava/lang/Object;Z)Ll/ۘۡۗ;

    move-result-object p1

    return-object p1

    :pswitch_7
    const-wide/16 v3, 0x1

    cmp-long p2, v1, v3

    if-nez p2, :cond_9

    goto :goto_7

    :cond_9
    const/4 v0, 0x0

    .line 138
    :goto_7
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p0, p1, p2, v7}, Ll/ۜᩳۗ;->ۙ(Ll/᩻ۡۗ;Ljava/lang/Object;Z)Ll/ۘۡۗ;

    move-result-object p1

    return-object p1

    :goto_8
    const/4 p1, 0x0

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ۙ(Ll/ܽۡۗ;Ljava/lang/Object;Z)V
    .locals 2

    if-eqz p3, :cond_0

    .line 82
    iget-object p3, p0, Ll/ۜᩳۗ;->᩷:Ll/۠ᩳۗ;

    invoke-virtual {p3, p2, p1}, Ll/۠ᩳۗ;->ۙ(Ljava/lang/Object;Ll/ܽۡۗ;)V

    return-void

    .line 77
    :cond_0
    invoke-virtual {p1}, Ll/ܽۡۗ;->᩷ۙ()Ll/᩻ۡۗ;

    move-result-object p3

    .line 91
    new-instance v0, Ll/ۡᩳۗ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Ll/ۜᩳۗ;->ۙ:Ljava/util/HashMap;

    invoke-static {v1, p3, v0}, Ll/ۧۚۗ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/۠ᩳۗ;

    .line 77
    invoke-virtual {p3, p2, p1}, Ll/۠ᩳۗ;->ۙ(Ljava/lang/Object;Ll/ܽۡۗ;)V

    return-void
.end method

.method public final ۙ(Ll/᩻ۡۗ;)V
    .locals 1

    .line 86
    iget-object v0, p0, Ll/ۜᩳۗ;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    iget-object v0, p0, Ll/ۜᩳۗ;->᩷:Ll/۠ᩳۗ;

    invoke-virtual {v0, p1}, Ll/۠ᩳۗ;->ۙ(Ll/᩻ۡۗ;)V

    return-void
.end method
