.class public abstract Ll/ܺ۟ۗ;
.super Ljava/lang/Object;
.source "K6GH"

# interfaces
.implements Ll/ۛ۟ۗ;


# static fields
.field public static final ᩶:Ll/᩵۟ۗ;


# instance fields
.field public ܰ:Ll/ۗ۟ۗ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 14
    sget-object v0, Ll/᩵۟ۗ;->᩸:Ll/᩵۟ۗ;

    sput-object v0, Ll/ܺ۟ۗ;->᩶:Ll/᩵۟ۗ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    sget-object v0, Ll/ܺ۟ۗ;->᩶:Ll/᩵۟ۗ;

    iput-object v0, p0, Ll/ܺ۟ۗ;->ܰ:Ll/ۗ۟ۗ;

    return-void
.end method

.method private ۖ()Ll/ۗ۟ۗ;
    .locals 2

    .line 81
    iget-object v0, p0, Ll/ܺ۟ۗ;->ܰ:Ll/ۗ۟ۗ;

    .line 82
    sget-object v1, Ll/ܺ۟ۗ;->᩶:Ll/᩵۟ۗ;

    if-ne v0, v1, :cond_0

    .line 83
    new-instance v0, Ll/ۗ۟ۗ;

    invoke-direct {v0}, Ll/ۗ۟ۗ;-><init>()V

    .line 84
    iput-object v0, p0, Ll/ܺ۟ۗ;->ܰ:Ll/ۗ۟ۗ;

    :cond_0
    return-object v0
.end method

.method private ۠()V
    .locals 2

    .line 90
    iget-object v0, p0, Ll/ܺ۟ۗ;->ܰ:Ll/ۗ۟ۗ;

    invoke-virtual {v0}, Ll/ۗ۟ۗ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܺ۟ۗ;->ܰ:Ll/ۗ۟ۗ;

    sget-object v1, Ll/ܺ۟ۗ;->᩶:Ll/᩵۟ۗ;

    if-eq v0, v1, :cond_0

    .line 91
    iput-object v1, p0, Ll/ܺ۟ۗ;->ܰ:Ll/ۗ۟ۗ;

    :cond_0
    return-void
.end method


# virtual methods
.method public ֨()Ljava/lang/String;
    .locals 1

    .line 331
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/ۧ۟ۗ;)Ljava/util/List;
    .locals 1

    .line 117
    iget-object v0, p0, Ll/ܺ۟ۗ;->ܰ:Ll/ۗ۟ۗ;

    invoke-virtual {v0, p1}, Ll/ۗ۟ۗ;->ۙ(Ll/ۧ۟ۗ;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;
    .locals 1

    .line 107
    iget-object v0, p0, Ll/ܺ۟ۗ;->ܰ:Ll/ۗ۟ۗ;

    invoke-virtual {v0, p1}, Ll/ۗ۟ۗ;->᩷(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ljava/util/List;)V
    .locals 1

    .line 37
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 40
    :cond_0
    invoke-direct {p0}, Ll/ܺ۟ۗ;->ۖ()Ll/ۗ۟ۗ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۗ۟ۗ;->ۙ(Ljava/util/List;)V

    return-void
.end method

.method public final ۙ(Ll/ۚᩳۗ;Ll/ۧ۟ۗ;)V
    .locals 0

    .line 107
    iget-object p1, p1, Ll/ܺ۟ۗ;->ܰ:Ll/ۗ۟ۗ;

    invoke-virtual {p1, p2}, Ll/ۗ۟ۗ;->᩷(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 67
    invoke-virtual {p0, p1}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    :cond_0
    return-void
.end method

.method public final ۙ(Ll/ۧ۟ۗ;Ljava/lang/Object;)V
    .locals 3

    .line 45
    invoke-direct {p0}, Ll/ܺ۟ۗ;->ۖ()Ll/ۗ۟ۗ;

    move-result-object v0

    .line 65
    invoke-virtual {v0, p1}, Ll/ۗ۟ۗ;->᩷(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v1

    check-cast v1, Ll/᩻۟ۗ;

    if-eqz v1, :cond_0

    .line 67
    invoke-virtual {v1}, Ll/᩻۟ۗ;->ۙ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 69
    :cond_0
    new-instance v1, Ll/᩻۟ۗ;

    .line 23
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 24
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    invoke-direct {v1, p1, v2}, Ll/᩻۟ۗ;-><init>(Ll/ۧ۟ۗ;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Ll/ۗ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    return-void
.end method

.method public final ۙ(Ll/ۧ۟ۗ;Ljava/util/List;)V
    .locals 2

    .line 52
    invoke-direct {p0}, Ll/ܺ۟ۗ;->ۖ()Ll/ۗ۟ۗ;

    move-result-object v0

    .line 74
    invoke-virtual {v0, p1}, Ll/ۗ۟ۗ;->᩷(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v1

    check-cast v1, Ll/᩻۟ۗ;

    if-eqz v1, :cond_0

    .line 76
    invoke-virtual {v1}, Ll/᩻۟ۗ;->ۙ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void

    .line 78
    :cond_0
    new-instance v1, Ll/᩻۟ۗ;

    invoke-direct {v1, p1, p2}, Ll/᩻۟ۗ;-><init>(Ll/ۧ۟ۗ;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Ll/ۗ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    return-void
.end method

.method public final ۙ(Ll/ۧ᩶ۗ;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ll/ܺ۟ۗ;->ۖ()Ll/ۗ۟ۗ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۗ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    return-void
.end method

.method public final ۙ(Ll/ܺ۟ۗ;)V
    .locals 1

    .line 57
    iget-object p1, p1, Ll/ܺ۟ۗ;->ܰ:Ll/ۗ۟ۗ;

    .line 58
    invoke-virtual {p1}, Ll/ۗ۟ۗ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 59
    invoke-direct {p0}, Ll/ܺ۟ۗ;->ۖ()Ll/ۗ۟ۗ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۗ۟ۗ;->ۙ(Ll/ۗ۟ۗ;)V

    :cond_0
    return-void
.end method

.method public final ۙ(Ll/֫۟ۗ;)Z
    .locals 1

    .line 97
    iget-object v0, p0, Ll/ܺ۟ۗ;->ܰ:Ll/ۗ۟ۗ;

    invoke-virtual {v0, p1}, Ll/ۗ۟ۗ;->᩷(Ll/֫۟ۗ;)Z

    move-result p1

    return p1
.end method

.method public final ۟()V
    .locals 1

    .line 140
    sget-object v0, Ll/ܺ۟ۗ;->᩶:Ll/᩵۟ۗ;

    iput-object v0, p0, Ll/ܺ۟ۗ;->ܰ:Ll/ۗ۟ۗ;

    return-void
.end method

.method public final ۡ()V
    .locals 2

    .line 144
    iget-object v0, p0, Ll/ܺ۟ۗ;->ܰ:Ll/ۗ۟ۗ;

    sget-object v1, Ll/ܺ۟ۗ;->᩶:Ll/᩵۟ۗ;

    if-ne v0, v1, :cond_0

    return-void

    .line 147
    :cond_0
    invoke-virtual {v0}, Ll/ۗ۟ۗ;->᩸()V

    .line 148
    iget-object v0, p0, Ll/ܺ۟ۗ;->ܰ:Ll/ۗ۟ۗ;

    invoke-virtual {v0}, Ll/ۗ۟ۗ;->ۙ()V

    .line 149
    invoke-direct {p0}, Ll/ܺ۟ۗ;->۠()V

    return-void
.end method

.method public final ۢ()Z
    .locals 1

    .line 164
    iget-object v0, p0, Ll/ܺ۟ۗ;->ܰ:Ll/ۗ۟ۗ;

    invoke-virtual {v0}, Ll/ۗ۟ۗ;->ۤ()Z

    move-result v0

    return v0
.end method

.method public final ۤ(Ll/֫۟ۗ;)V
    .locals 1

    .line 122
    iget-object v0, p0, Ll/ܺ۟ۗ;->ܰ:Ll/ۗ۟ۗ;

    invoke-virtual {v0, p1}, Ll/ۗ۟ۗ;->ۤ(Ll/֫۟ۗ;)V

    .line 123
    invoke-direct {p0}, Ll/ܺ۟ۗ;->۠()V

    return-void
.end method

.method public final ۤ(Ll/֫᩶ۗ;)V
    .locals 1

    .line 128
    iget-object v0, p0, Ll/ܺ۟ۗ;->ܰ:Ll/ۗ۟ۗ;

    invoke-virtual {v0, p1}, Ll/ۗ۟ۗ;->ۤ(Ll/֫᩶ۗ;)V

    .line 129
    invoke-direct {p0}, Ll/ܺ۟ۗ;->۠()V

    return-void
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 159
    iget-object v0, p0, Ll/ܺ۟ۗ;->ܰ:Ll/ۗ۟ۗ;

    invoke-virtual {v0}, Ll/ۗ۟ۗ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷(Ll/֫۟ۗ;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ll/ܺ۟ۗ;->ۖ()Ll/ۗ۟ۗ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۗ۟ۗ;->ۙ(Ll/֫۟ۗ;)V

    return-void
.end method

.method public final ᩷(Ll/֫᩶ۗ;)Z
    .locals 1

    .line 102
    iget-object v0, p0, Ll/ܺ۟ۗ;->ܰ:Ll/ۗ۟ۗ;

    invoke-virtual {v0, p1}, Ll/ۗ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Z

    move-result p1

    return p1
.end method
