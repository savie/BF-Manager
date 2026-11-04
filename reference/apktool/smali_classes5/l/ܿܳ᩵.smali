.class public final Ll/ܿܳ᩵;
.super Ljava/lang/Object;
.source "RIV7"

# interfaces
.implements Ll/ۘܳ᩵;


# instance fields
.field public ֡:Z

.field public ֨:Z

.field public final ۖ:Ll/ۢ۫᩵;

.field public final ۜ:Ll/ۜ۫᩵;

.field public final ۟:Ljava/util/function/Function;

.field public ۠:Ll/ܺ֨ۗ;

.field public final ۡ:Ljava/util/Set;

.field public final ۢ:Ll/ܳۢۗ;

.field public ۬:Ll/֫֨ۗ;

.field public ܰ:Z

.field public ܿ:I

.field public final ᩳ:Ljava/util/function/Supplier;

.field public final ᩶:I


# direct methods
.method public constructor <init>(Ll/ۢ۫᩵;Ll/ۜ۫᩵;Ll/ܳۢۗ;ILjava/util/Set;Ljava/util/function/Supplier;Ljava/util/function/Function;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Ll/ܿܳ᩵;->ܰ:Z

    const/4 v0, -0x1

    .line 29
    iput v0, p0, Ll/ܿܳ᩵;->ܿ:I

    const/4 v0, 0x0

    .line 33
    iput-boolean v0, p0, Ll/ܿܳ᩵;->֡:Z

    .line 37
    iput-object p1, p0, Ll/ܿܳ᩵;->ۖ:Ll/ۢ۫᩵;

    .line 38
    iput-object p2, p0, Ll/ܿܳ᩵;->ۜ:Ll/ۜ۫᩵;

    .line 39
    iput-object p3, p0, Ll/ܿܳ᩵;->ۢ:Ll/ܳۢۗ;

    .line 40
    iput p4, p0, Ll/ܿܳ᩵;->᩶:I

    .line 41
    iput-object p5, p0, Ll/ܿܳ᩵;->ۡ:Ljava/util/Set;

    .line 42
    iput-object p6, p0, Ll/ܿܳ᩵;->ᩳ:Ljava/util/function/Supplier;

    .line 43
    iput-object p7, p0, Ll/ܿܳ᩵;->۟:Ljava/util/function/Function;

    return-void
.end method

.method public static ۙ(Ll/ܿܳ᩵;Ll/֫֨ۗ;)Ljava/lang/Boolean;
    .locals 1

    .line 139
    invoke-virtual {p1}, Ll/֫֨ۗ;->᩺()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Ll/ܿܳ᩵;->ۡ:Ljava/util/Set;

    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    .line 140
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private ۙ(Ljava/util/Set;Ll/֫֨ۗ;)Ll/֫֨ۗ;
    .locals 1

    if-nez p2, :cond_0

    goto :goto_0

    .line 123
    :cond_0
    invoke-virtual {p2}, Ll/֫֨ۗ;->֡()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 126
    :cond_1
    invoke-virtual {p2}, Ll/֫֨ۗ;->᩸()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 127
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    .line 130
    :cond_2
    new-instance p1, Ll/ܰܳ᩵;

    const/4 v0, 0x0

    invoke-direct {p1, v0, p0}, Ll/ܰܳ᩵;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p2, p1}, Ll/֫֨ۗ;->ۙ(Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_3

    :goto_0
    const/4 p1, 0x0

    return-object p1

    :cond_3
    return-object p2
.end method


# virtual methods
.method public final ۙ()Ll/ۙۚ᩵;
    .locals 5

    const/4 v0, 0x1

    .line 79
    iput-boolean v0, p0, Ll/ܿܳ᩵;->֡:Z

    .line 80
    sget-object v1, Ll/ۙۚ᩵;->֡:Ll/ۙۚ᩵;

    .line 81
    iget-object v2, p0, Ll/ܿܳ᩵;->ۢ:Ll/ܳۢۗ;

    invoke-virtual {v2}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 82
    invoke-virtual {v2}, Ll/ۛ֨ۗ;->ۖ()Z

    move-result v3

    if-nez v3, :cond_0

    .line 83
    iget-object v3, p0, Ll/ܿܳ᩵;->ᩳ:Ljava/util/function/Supplier;

    invoke-interface {v3}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫֨ۗ;

    iget-object v4, p0, Ll/ܿܳ᩵;->ۡ:Ljava/util/Set;

    invoke-direct {p0, v4, v3}, Ll/ܿܳ᩵;->ۙ(Ljava/util/Set;Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 85
    iput-object v2, p0, Ll/ܿܳ᩵;->۠:Ll/ܺ֨ۗ;

    .line 86
    iput-object v3, p0, Ll/ܿܳ᩵;->۬:Ll/֫֨ۗ;

    .line 87
    iput-boolean v0, p0, Ll/ܿܳ᩵;->֨:Z

    const/4 v0, 0x0

    .line 88
    iput-boolean v0, p0, Ll/ܿܳ᩵;->֡:Z

    .line 89
    iget-object v0, p0, Ll/ܿܳ᩵;->ۖ:Ll/ۢ۫᩵;

    iget-object v1, p0, Ll/ܿܳ᩵;->ۜ:Ll/ۜ۫᩵;

    invoke-virtual {v0, v1, v2, v3, p0}, Ll/ۢ۫᩵;->ۙ(Ll/ۜ۫᩵;Ll/ܺ֨ۗ;Ll/֫֨ۗ;Ll/ۘܳ᩵;)Ll/ۙۚ᩵;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 95
    :cond_0
    invoke-virtual {p0, v1}, Ll/ܿܳ᩵;->ۙ(Ll/ۙۚ᩵;)Ll/ۙۚ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/ۙۚ᩵;)Ll/ۙۚ᩵;
    .locals 5

    .line 49
    :cond_0
    sget-object v0, Ll/᩶ܳ᩵;->ۙ:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    iget-object v0, p0, Ll/ܿܳ᩵;->ۖ:Ll/ۢ۫᩵;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v1, :cond_3

    const/4 v3, 0x2

    if-eq p1, v3, :cond_1

    goto :goto_1

    .line 55
    :cond_1
    invoke-virtual {v0}, Ll/ۢ۫᩵;->ۙ()Ll/۠ܳ᩵;

    move-result-object p1

    iget-object v3, p0, Ll/ܿܳ᩵;->۬:Ll/֫֨ۗ;

    iget-object v4, p0, Ll/ܿܳ᩵;->۠:Ll/ܺ֨ۗ;

    invoke-virtual {v4}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v4

    invoke-virtual {p1, v3, v4}, Ll/۠ܳ᩵;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/ۜܳ᩵;

    move-result-object p1

    .line 56
    iget-boolean v3, p0, Ll/ܿܳ᩵;->֨:Z

    if-eqz v3, :cond_2

    invoke-virtual {p1}, Ll/ۜܳ᩵;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ll/ۜܳ᩵;->۫()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 57
    :goto_0
    sget-object p1, Ll/ۙۚ᩵;->ܿ:Ll/ۙۚ᩵;

    return-object p1

    .line 51
    :cond_3
    iput-boolean v2, p0, Ll/ܿܳ᩵;->ܰ:Z

    .line 100
    :cond_4
    :goto_1
    iget p1, p0, Ll/ܿܳ᩵;->ܿ:I

    add-int/2addr p1, v1

    iput p1, p0, Ll/ܿܳ᩵;->ܿ:I

    .line 102
    iget v3, p0, Ll/ܿܳ᩵;->᩶:I

    if-lt p1, v3, :cond_6

    .line 62
    iget-boolean p1, p0, Ll/ܿܳ᩵;->ܰ:Z

    if-eqz p1, :cond_5

    sget-object p1, Ll/ۙۚ᩵;->֡:Ll/ۙۚ᩵;

    return-object p1

    :cond_5
    sget-object p1, Ll/ۙۚ᩵;->᩶:Ll/ۙۚ᩵;

    return-object p1

    .line 105
    :cond_6
    iget-object v3, p0, Ll/ܿܳ᩵;->ۢ:Ll/ܳۢۗ;

    invoke-virtual {v3}, Ll/ܳۢۗ;->ۛۙ()I

    move-result v4

    add-int/2addr v4, p1

    .line 106
    invoke-virtual {v3, v4}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v3

    .line 107
    invoke-virtual {v3}, Ll/֡֨ۗ;->ۖ()Z

    move-result v4

    if-nez v4, :cond_4

    .line 108
    iget-object v4, p0, Ll/ܿܳ᩵;->۟:Ljava/util/function/Function;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v4, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫֨ۗ;

    iget-object v4, p0, Ll/ܿܳ᩵;->ۡ:Ljava/util/Set;

    invoke-direct {p0, v4, p1}, Ll/ܿܳ᩵;->ۙ(Ljava/util/Set;Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 110
    iput-object v3, p0, Ll/ܿܳ᩵;->۠:Ll/ܺ֨ۗ;

    .line 111
    iput-object p1, p0, Ll/ܿܳ᩵;->۬:Ll/֫֨ۗ;

    .line 112
    iput-boolean v2, p0, Ll/ܿܳ᩵;->֨:Z

    .line 65
    iget-boolean v1, p0, Ll/ܿܳ᩵;->֡:Z

    const/4 v4, 0x0

    if-eqz v1, :cond_7

    .line 67
    iput-boolean v2, p0, Ll/ܿܳ᩵;->֡:Z

    move-object v1, p0

    goto :goto_2

    :cond_7
    move-object v1, v4

    .line 71
    :goto_2
    iget-object v2, p0, Ll/ܿܳ᩵;->ۜ:Ll/ۜ۫᩵;

    invoke-virtual {v0, v2, v3, p1, v1}, Ll/ۢ۫᩵;->ۙ(Ll/ۜ۫᩵;Ll/ܺ֨ۗ;Ll/֫֨ۗ;Ll/ۘܳ᩵;)Ll/ۙۚ᩵;

    move-result-object p1

    if-nez p1, :cond_0

    return-object v4
.end method
