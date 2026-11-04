.class public final Ll/ܰۙܳ;
.super Ljava/lang/Object;
.source "2IQX"

# interfaces
.implements Ll/ܶ᩷ܳ;


# instance fields
.field public final synthetic ܰ:Ll/ܿۙܳ;

.field public final synthetic ᩶:Z


# direct methods
.method public constructor <init>(Ll/ܿۙܳ;Z)V
    .locals 0

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰۙܳ;->ܰ:Ll/ܿۙܳ;

    iput-boolean p2, p0, Ll/ܰۙܳ;->᩶:Z

    return-void
.end method


# virtual methods
.method public final ۙ(IIIZ)V
    .locals 0

    .line 85
    iget-object p1, p0, Ll/ܰۙܳ;->ܰ:Ll/ܿۙܳ;

    invoke-static {p1}, Ll/ܿۙܳ;->᩷(Ll/ܿۙܳ;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-static {p1}, Ll/ܿۙܳ;->ۚ(Ll/ܿۙܳ;)Z

    move-result p2

    if-nez p2, :cond_0

    iget-boolean p2, p0, Ll/ܰۙܳ;->᩶:Z

    invoke-static {p1}, Ll/ܿۙܳ;->᩸(Ll/ܿۙܳ;)Z

    move-result p3

    if-ne p2, p3, :cond_0

    const-wide/16 p2, -0x1

    .line 86
    invoke-static {p1, p2, p3}, Ll/ܿۙܳ;->᩷(Ll/ܿۙܳ;J)V

    .line 87
    invoke-static {p1}, Ll/ܿۙܳ;->᩻(Ll/ܿۙܳ;)V

    .line 88
    invoke-static {p1}, Ll/ܿۙܳ;->ܽ(Ll/ܿۙܳ;)V

    .line 89
    invoke-static {p1}, Ll/ܿۙܳ;->ܶ(Ll/ܿۙܳ;)V

    :cond_0
    return-void
.end method

.method public final ۙ(Ljava/io/IOException;)V
    .locals 2

    .line 110
    iget-object v0, p0, Ll/ܰۙܳ;->ܰ:Ll/ܿۙܳ;

    invoke-static {v0}, Ll/ܿۙܳ;->ܳ(Ll/ܿۙܳ;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 111
    invoke-static {v0}, Ll/ܿۙܳ;->ܺ(Ll/ܿۙܳ;)V

    .line 112
    invoke-static {v0}, Ll/ܿۙܳ;->ۤ(Ll/ܿۙܳ;)Ll/ۨ᩷ܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۨ᩷ܳ;->᩵()V

    invoke-static {v0}, Ll/ܿۙܳ;->۫(Ll/ܿۙܳ;)Ll/ۨ᩷ܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۨ᩷ܳ;->᩵()V

    .line 113
    invoke-static {v0}, Ll/ܿۙܳ;->ᩴ(Ll/ܿۙܳ;)Ll/᩶ۙܳ;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/ܿۙܳ;->ᩴ(Ll/ܿۙܳ;)Ll/᩶ۙܳ;

    move-result-object v0

    check-cast v0, Ll/᩸ۙܳ;

    invoke-virtual {v0, p1}, Ll/᩸ۙܳ;->ۙ(Ljava/io/IOException;)V

    :cond_0
    return-void
.end method

.method public final ۙ(Z)V
    .locals 2

    .line 106
    iget-object v0, p0, Ll/ܰۙܳ;->ܰ:Ll/ܿۙܳ;

    invoke-static {v0}, Ll/ܿۙܳ;->ᩴ(Ll/ܿۙܳ;)Ll/᩶ۙܳ;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/ܿۙܳ;->ᩴ(Ll/ܿۙܳ;)Ll/᩶ۙܳ;

    move-result-object v0

    check-cast v0, Ll/᩸ۙܳ;

    invoke-virtual {v0, p1}, Ll/᩸ۙܳ;->ۙ(Z)V

    :cond_0
    return-void
.end method

.method public final ۙ(ZZZ)V
    .locals 0

    .line 101
    iget-object p1, p0, Ll/ܰۙܳ;->ܰ:Ll/ܿۙܳ;

    invoke-static {p1}, Ll/ܿۙܳ;->᩷(Ll/ܿۙܳ;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    .line 102
    :cond_0
    invoke-virtual {p1}, Ll/ܿۙܳ;->֫()V

    .line 103
    invoke-static {p1}, Ll/ܿۙܳ;->ܶ(Ll/ܿۙܳ;)V

    return-void
.end method

.method public final ۙ(J)Z
    .locals 4

    .line 93
    iget-object v0, p0, Ll/ܰۙܳ;->ܰ:Ll/ܿۙܳ;

    invoke-static {v0}, Ll/ܿۙܳ;->ۙ(Ll/ܿۙܳ;)Ll/۬ۙܳ;

    move-result-object v1

    if-eqz v1, :cond_1

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-ltz v3, :cond_1

    invoke-static {v0}, Ll/ܿۙܳ;->ۙ(Ll/ܿۙܳ;)Ll/۬ۙܳ;

    move-result-object v1

    iget-wide v1, v1, Ll/۬ۙܳ;->᩸:J

    cmp-long v3, p1, v1

    if-ltz v3, :cond_0

    goto :goto_0

    .line 94
    :cond_0
    invoke-static {v0, p1, p2}, Ll/ܿۙܳ;->᩷(Ll/ܿۙܳ;J)V

    invoke-static {v0}, Ll/ܿۙܳ;->֫(Ll/ܿۙܳ;)V

    .line 95
    invoke-static {v0}, Ll/ܿۙܳ;->ۧ(Ll/ܿۙܳ;)V

    invoke-static {v0}, Ll/ܿۙܳ;->ܽ(Ll/ܿۙܳ;)V

    .line 96
    invoke-static {v0}, Ll/ܿۙܳ;->ܶ(Ll/ܿۙܳ;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܳ()V
    .locals 2

    .line 99
    iget-object v0, p0, Ll/ܰۙܳ;->ܰ:Ll/ܿۙܳ;

    invoke-static {v0}, Ll/ܿۙܳ;->ᩴ(Ll/ܿۙܳ;)Ll/᩶ۙܳ;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/ܿۙܳ;->ᩴ(Ll/ܿۙܳ;)Ll/᩶ۙܳ;

    move-result-object v0

    check-cast v0, Ll/᩸ۙܳ;

    invoke-virtual {v0}, Ll/᩸ۙܳ;->ܳ()V

    :cond_0
    return-void
.end method
