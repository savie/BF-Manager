.class public final Ll/ۚ᩺ܺ;
.super Ljava/lang/Object;
.source "4BFQ"


# instance fields
.field public ۙ:Ljava/lang/Object;

.field public ᩷:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/ܺۛܺ;IIII)V
    .locals 1

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance v0, Ll/֫᩺ܺ;

    invoke-direct {v0, p1, p2, p4, p5}, Ll/֫᩺ܺ;-><init>(Ll/ܺۛܺ;III)V

    iput-object v0, p0, Ll/ۚ᩺ܺ;->ۙ:Ljava/lang/Object;

    .line 57
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ll/ۚ᩺ܺ;->᩷:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([B[B[B)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Ll/ۚ᩺ܺ;->ۙ:Ljava/lang/Object;

    .line 26
    iput-object p3, p0, Ll/ۚ᩺ܺ;->᩷:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public ۙ()Ll/֫᩺ܺ;
    .locals 4

    .line 113
    iget-object v0, p0, Ll/ۚ᩺ܺ;->ۙ:Ljava/lang/Object;

    check-cast v0, Ll/֫᩺ܺ;

    iget-object v1, p0, Ll/ۚ᩺ܺ;->᩷:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    if-eqz v1, :cond_1

    .line 126
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 129
    iget-object v3, p0, Ll/ۚ᩺ܺ;->᩷:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۛܺ;

    invoke-virtual {v0, v3}, Ll/֫᩺ܺ;->ۙ(Ll/ᩳۛܺ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 132
    iput-object v1, p0, Ll/ۚ᩺ܺ;->᩷:Ljava/lang/Object;

    return-object v0

    .line 114
    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "already processed"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۙ(I)Ll/ᩳۛܺ;
    .locals 2

    .line 70
    iget-object v0, p0, Ll/ۚ᩺ܺ;->ۙ:Ljava/lang/Object;

    check-cast v0, Ll/֫᩺ܺ;

    invoke-virtual {v0}, Ll/֫᩺ܺ;->ᩴ()I

    move-result v1

    if-ge p1, v1, :cond_1

    if-gez p1, :cond_0

    goto :goto_0

    .line 73
    :cond_0
    invoke-virtual {v0, p1}, Ll/֫᩺ܺ;->ۙ(I)Ll/ᩳۛܺ;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public ۙ(Ll/ᩳۛܺ;)V
    .locals 1

    .line 66
    iget-object v0, p0, Ll/ۚ᩺ܺ;->ۙ:Ljava/lang/Object;

    check-cast v0, Ll/֫᩺ܺ;

    invoke-virtual {v0, p1}, Ll/֫᩺ܺ;->ۙ(Ll/ᩳۛܺ;)V

    return-void
.end method

.method public ۙ(Ll/᩶ۛܺ;)V
    .locals 1

    .line 92
    iget-object v0, p0, Ll/ۚ᩺ܺ;->ۙ:Ljava/lang/Object;

    check-cast v0, Ll/֫᩺ܺ;

    invoke-virtual {v0, p1}, Ll/֫᩺ܺ;->ۙ(Ll/᩶ۛܺ;)V

    return-void
.end method

.method public ۤ()[B
    .locals 1

    .line 38
    iget-object v0, p0, Ll/ۚ᩺ܺ;->᩷:Ljava/lang/Object;

    check-cast v0, [B

    return-object v0
.end method

.method public ᩷(Ll/ᩳۛܺ;)V
    .locals 1

    .line 101
    iget-object v0, p0, Ll/ۚ᩺ܺ;->᩷:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public ᩷()[B
    .locals 1

    .line 30
    iget-object v0, p0, Ll/ۚ᩺ܺ;->ۙ:Ljava/lang/Object;

    check-cast v0, [B

    return-object v0
.end method

.method public ᩸()I
    .locals 1

    .line 78
    iget-object v0, p0, Ll/ۚ᩺ܺ;->ۙ:Ljava/lang/Object;

    check-cast v0, Ll/֫᩺ܺ;

    invoke-virtual {v0}, Ll/֫᩺ܺ;->ᩴ()I

    move-result v0

    return v0
.end method
