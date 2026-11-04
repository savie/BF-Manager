.class public final Ll/ܽۢۗ;
.super Ll/ܺۢۗ;
.source "IIVR"


# static fields
.field public static final ۙۙ:Ll/֫֨ۗ;

.field public static final ۬:Ll/֫֨ۗ;


# instance fields
.field public ۖ:Ll/᩷ۡۗ;

.field public ۜ:Ll/᩷ۡۗ;

.field public ۠:Ll/ܶۢۗ;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    .line 48
    sget-object v0, Ll/ۨ֨ۗ;->۠:Ll/ۨ֨ۗ;

    sget-object v1, Ll/ۨ֨ۗ;->ۢ:Ll/ۨ֨ۗ;

    sget-object v2, Ll/ۨ֨ۗ;->ۙۙ:Ll/ۨ֨ۗ;

    sget-object v3, Ll/ۨ֨ۗ;->֨:Ll/ۨ֨ۗ;

    const/4 v4, 0x7

    new-array v4, v4, [Ll/ۨ֨ۗ;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    sget-object v6, Ll/ۨ֨ۗ;->ᩳ:Ll/ۨ֨ۗ;

    const/4 v7, 0x1

    aput-object v6, v4, v7

    sget-object v6, Ll/ۨ֨ۗ;->۬:Ll/ۨ֨ۗ;

    const/4 v8, 0x2

    aput-object v6, v4, v8

    sget-object v6, Ll/ۨ֨ۗ;->۟:Ll/ۨ֨ۗ;

    const/4 v9, 0x3

    aput-object v6, v4, v9

    const/4 v6, 0x4

    aput-object v1, v4, v6

    const/4 v10, 0x5

    aput-object v2, v4, v10

    const/4 v10, 0x6

    aput-object v3, v4, v10

    invoke-static {v4}, Ll/֫֨ۗ;->ۙ([Ll/ۨ֨ۗ;)Ll/֫֨ۗ;

    move-result-object v4

    sput-object v4, Ll/ܽۢۗ;->ۙۙ:Ll/֫֨ۗ;

    new-array v4, v6, [Ll/ۨ֨ۗ;

    aput-object v0, v4, v5

    aput-object v1, v4, v7

    aput-object v2, v4, v8

    aput-object v3, v4, v9

    .line 53
    invoke-static {v4}, Ll/֫֨ۗ;->ۙ([Ll/ۨ֨ۗ;)Ll/֫֨ۗ;

    move-result-object v0

    sput-object v0, Ll/ܽۢۗ;->۬:Ll/֫֨ۗ;

    return-void
.end method

.method public constructor <init>(Ll/ۜ᩶ۗ;Ll/ܶۢۗ;)V
    .locals 3

    .line 25
    sget-object v0, Ll/᩺ۢۗ;->۫ۙ:Ll/᩺ۢۗ;

    invoke-interface {p1}, Ll/ۜ᩶ۗ;->ۙ()I

    move-result v1

    const/4 v2, 0x2

    invoke-direct {p0, v0, v1, v2}, Ll/ܺۢۗ;-><init>(Ll/᩺ۢۗ;II)V

    .line 26
    iput-object p2, p0, Ll/ܽۢۗ;->۠:Ll/ܶۢۗ;

    .line 57
    sget-object v0, Ll/ܶۢۗ;->ܿ:Ll/ܶۢۗ;

    if-eq p2, v0, :cond_1

    sget-object v0, Ll/ܶۢۗ;->֨:Ll/ܶۢۗ;

    if-ne p2, v0, :cond_0

    goto :goto_0

    .line 60
    :cond_0
    sget-object p2, Ll/ܽۢۗ;->۬:Ll/֫֨ۗ;

    goto :goto_1

    .line 58
    :cond_1
    :goto_0
    sget-object p2, Ll/ܽۢۗ;->ۙۙ:Ll/֫֨ۗ;

    .line 28
    :goto_1
    sget v0, Ll/ܺ֨ۗ;->۟:I

    const/4 v0, 0x0

    .line 35
    invoke-interface {p1, v0}, Ll/ۜ᩶ۗ;->ۙ(I)I

    move-result v0

    .line 31
    new-instance v1, Ll/ۛ֨ۗ;

    invoke-direct {v1, v0, p2}, Ll/ۛ֨ۗ;-><init>(ILl/֫֨ۗ;)V

    .line 28
    invoke-virtual {p0, v1}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    .line 29
    invoke-interface {p1}, Ll/ۜ᩶ۗ;->ܶ()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const-wide/16 v0, 0x0

    .line 62
    invoke-static {v0, v1, p2}, Ll/᩹֨ۗ;->᩷(JLl/֫֨ۗ;)Ll/᩹֨ۗ;

    move-result-object p1

    .line 30
    invoke-virtual {p0, p1}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    return-void

    .line 35
    :cond_2
    invoke-interface {p1, v1}, Ll/ۜ᩶ۗ;->ۙ(I)I

    move-result p1

    .line 31
    new-instance v0, Ll/ۛ֨ۗ;

    invoke-direct {v0, p1, p2}, Ll/ۛ֨ۗ;-><init>(ILl/֫֨ۗ;)V

    .line 32
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    return-void
.end method

.method public constructor <init>(Ll/ܶۢۗ;I)V
    .locals 2

    .line 43
    sget-object v0, Ll/᩺ۢۗ;->۫ۙ:Ll/᩺ۢۗ;

    const/4 v1, 0x2

    invoke-direct {p0, v0, p2, v1}, Ll/ܺۢۗ;-><init>(Ll/᩺ۢۗ;II)V

    .line 44
    iput-object p1, p0, Ll/ܽۢۗ;->۠:Ll/ܶۢۗ;

    return-void
.end method

.method public constructor <init>(Ll/ܶۢۗ;Ll/ܺ֨ۗ;Ll/᩹֨ۗ;)V
    .locals 1

    const/4 v0, -0x1

    .line 37
    invoke-direct {p0, p1, v0}, Ll/ܽۢۗ;-><init>(Ll/ܶۢۗ;I)V

    .line 38
    invoke-virtual {p0, p2}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    .line 39
    invoke-virtual {p0, p3}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    return-void
.end method


# virtual methods
.method public final normalize()V
    .locals 3

    .line 64
    iget-object v0, p0, Ll/ܽۢۗ;->۠:Ll/ܶۢۗ;

    .line 78
    sget-object v1, Ll/ܶۢۗ;->֨:Ll/ܶۢۗ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺ֨ۗ;->ۤۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 79
    sget-object v0, Ll/ܶۢۗ;->ܿ:Ll/ܶۢۗ;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-static {}, Ll/᩹֨ۗ;->᩹ۙ()Ll/᩹֨ۗ;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Ll/ܽۢۗ;->ۙ(Ll/ܶۢۗ;Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)V

    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Ll/ᩳۡۗ;->ۢ:I

    invoke-static {v1}, Ll/۠֫᩵;->ۙ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ᩳۡۗ;->ᩳ:Ll/᩺ۢۗ;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    .line 151
    invoke-virtual {p0, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ܽۢۗ;->۠:Ll/ܶۢۗ;

    invoke-virtual {v2}, Ll/ܶۢۗ;->ۙ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "  -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    iget-object v1, p0, Ll/ܽۢۗ;->ۜ:Ll/᩷ۡۗ;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget v1, p0, Ll/ܺۢۗ;->ۡ:I

    invoke-static {v1}, Ll/۠֫᩵;->ۙ(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 153
    invoke-virtual {p0}, Ll/ᩳۡۗ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/ܶۢۗ;Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)V
    .locals 0

    .line 84
    iput-object p1, p0, Ll/ܽۢۗ;->۠:Ll/ܶۢۗ;

    const/4 p1, 0x0

    .line 85
    invoke-virtual {p0, p1, p2}, Ll/ᩳۡۗ;->ۙ(ILl/ܺ֨ۗ;)V

    const/4 p1, 0x1

    .line 86
    invoke-virtual {p0, p1, p3}, Ll/ᩳۡۗ;->ۙ(ILl/ܺ֨ۗ;)V

    return-void
.end method

.method public final ۙ(Ll/᩷ۡۗ;)V
    .locals 2

    .line 91
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p1

    .line 92
    iget v0, p0, Ll/ܺۢۗ;->ۡ:I

    invoke-static {v0, p1}, Ll/᩹֫᩵;->ۙ(ILjava/util/List;)Ll/᩷ۡۗ;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۢۗ;->ۜ:Ll/᩷ۡۗ;

    .line 93
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 94
    iget-object p1, p0, Ll/ܽۢۗ;->ۜ:Ll/᩷ۡۗ;

    iput-object p1, p0, Ll/ܽۢۗ;->ۖ:Ll/᩷ۡۗ;

    return-void

    .line 96
    :cond_0
    iget-object v0, p0, Ll/ܽۢۗ;->ۜ:Ll/᩷ۡۗ;

    invoke-static {v0, p1}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ljava/util/List;)Ll/᩷ۡۗ;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۢۗ;->ۖ:Ll/᩷ۡۗ;

    return-void
.end method

.method public final ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V
    .locals 1

    .line 103
    iget-object v0, p0, Ll/ܽۢۗ;->ۜ:Ll/᩷ۡۗ;

    if-ne v0, p1, :cond_0

    .line 104
    iput-object p2, p0, Ll/ܽۢۗ;->ۜ:Ll/᩷ۡۗ;

    .line 107
    :cond_0
    iget-object v0, p0, Ll/ܽۢۗ;->ۖ:Ll/᩷ۡۗ;

    if-ne v0, p1, :cond_1

    .line 108
    iput-object p2, p0, Ll/ܽۢۗ;->ۖ:Ll/᩷ۡۗ;

    :cond_1
    return-void
.end method

.method public final ۛۙ()Ll/᩷ۡۗ;
    .locals 1

    .line 119
    iget-object v0, p0, Ll/ܽۢۗ;->ۖ:Ll/᩷ۡۗ;

    return-object v0
.end method

.method public final ۫ۙ()Ll/ᩳۡۗ;
    .locals 3

    .line 141
    new-instance v0, Ll/ܽۢۗ;

    iget-object v1, p0, Ll/ܽۢۗ;->۠:Ll/ܶۢۗ;

    iget v2, p0, Ll/ܺۢۗ;->ۡ:I

    invoke-direct {v0, v1, v2}, Ll/ܽۢۗ;-><init>(Ll/ܶۢۗ;I)V

    .line 142
    iget-object v1, p0, Ll/ܽۢۗ;->ۜ:Ll/᩷ۡۗ;

    iput-object v1, v0, Ll/ܽۢۗ;->ۜ:Ll/᩷ۡۗ;

    .line 143
    iget-object v1, p0, Ll/ܽۢۗ;->ۖ:Ll/᩷ۡۗ;

    iput-object v1, v0, Ll/ܽۢۗ;->ۖ:Ll/᩷ۡۗ;

    .line 144
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ll/ᩳۡۗ;)V

    return-object v0
.end method

.method public final ܰۙ()Ll/᩷ۡۗ;
    .locals 1

    .line 115
    iget-object v0, p0, Ll/ܽۢۗ;->ۜ:Ll/᩷ۡۗ;

    return-object v0
.end method

.method public final ᩴ(Ll/ᩳۡۗ;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 132
    :cond_0
    instance-of v1, p1, Ll/ܽۢۗ;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-super {p0, p1}, Ll/ᩳۡۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 135
    :cond_1
    check-cast p1, Ll/ܽۢۗ;

    .line 136
    iget-object v1, p0, Ll/ܽۢۗ;->۠:Ll/ܶۢۗ;

    iget-object p1, p1, Ll/ܽۢۗ;->۠:Ll/ܶۢۗ;

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v2
.end method

.method public final ᩵ۙ()I
    .locals 1

    .line 124
    iget-object v0, p0, Ll/ܽۢۗ;->ۜ:Ll/᩷ۡۗ;

    if-nez v0, :cond_0

    iget v0, p0, Ll/ܺۢۗ;->ۡ:I

    return v0

    :cond_0
    invoke-virtual {v0}, Ll/᩷ۡۗ;->᩻ۙ()I

    move-result v0

    return v0
.end method

.method public final ᩶ۙ()V
    .locals 2

    .line 68
    iget-object v0, p0, Ll/ܽۢۗ;->۠:Ll/ܶۢۗ;

    invoke-virtual {v0}, Ll/ܶۢۗ;->᩸()Ll/ܶۢۗ;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۢۗ;->۠:Ll/ܶۢۗ;

    .line 69
    iget-object v0, p0, Ll/ܽۢۗ;->ۜ:Ll/᩷ۡۗ;

    .line 70
    iget-object v1, p0, Ll/ܽۢۗ;->ۖ:Ll/᩷ۡۗ;

    iput-object v1, p0, Ll/ܽۢۗ;->ۜ:Ll/᩷ۡۗ;

    .line 71
    iput-object v0, p0, Ll/ܽۢۗ;->ۖ:Ll/᩷ۡۗ;

    return-void
.end method

.method public final ᩺ۙ()Ll/ܶۢۗ;
    .locals 1

    .line 64
    iget-object v0, p0, Ll/ܽۢۗ;->۠:Ll/ܶۢۗ;

    return-object v0
.end method
