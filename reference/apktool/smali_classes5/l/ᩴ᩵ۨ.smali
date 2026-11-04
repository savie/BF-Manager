.class public abstract Ll/ᩴ᩵ۨ;
.super Ll/۠᩷᩻;
.source "57J2"


# instance fields
.field public ᩷:Ll/ۤ᩵ۨ;


# virtual methods
.method public final ۙ(Ljava/io/InputStream;)V
    .locals 1

    .line 113
    new-instance v0, Ll/ۤ᩵ۨ;

    .line 703
    invoke-direct {v0, p1}, Ll/᩸᩵ۨ;-><init>(Ljava/io/InputStream;)V

    .line 310
    iput-object v0, p0, Ll/ᩴ᩵ۨ;->᩷:Ll/ۤ᩵ۨ;

    return-void
.end method

.method public final ܳ()Ll/᩸᩵ۨ;
    .locals 2

    .line 217
    iget-object v0, p0, Ll/ᩴ᩵ۨ;->᩷:Ll/ۤ᩵ۨ;

    if-eqz v0, :cond_0

    return-object v0

    .line 218
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "origin == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
