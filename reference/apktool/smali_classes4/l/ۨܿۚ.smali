.class public final Ll/ۨܿۚ;
.super Ljava/lang/Object;
.source "D6X3"


# instance fields
.field public final ۙ:Z

.field public final ۤ:J

.field public final ᩷:Ll/᩷ۨᩴ;

.field public final ᩸:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLl/᩷ۨᩴ;Ljava/lang/String;Z)V
    .locals 0

    .line 1749
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1750
    iput-object p3, p0, Ll/ۨܿۚ;->᩷:Ll/᩷ۨᩴ;

    .line 1751
    iput-boolean p5, p0, Ll/ۨܿۚ;->ۙ:Z

    .line 1752
    iput-wide p1, p0, Ll/ۨܿۚ;->ۤ:J

    .line 1753
    iput-object p4, p0, Ll/ۨܿۚ;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ۙ()Ljava/io/InputStream;
    .locals 2

    .line 1758
    iget-boolean v0, p0, Ll/ۨܿۚ;->ۙ:Z

    if-eqz v0, :cond_0

    .line 1761
    iget-object v0, p0, Ll/ۨܿۚ;->᩷:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ۧ᩷()Ljava/io/InputStream;

    move-result-object v0

    return-object v0

    .line 1759
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "The source file does not exist"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
