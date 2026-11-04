.class public final synthetic Ll/᩶ۢۚ;
.super Ljava/lang/Object;
.source "26KB"

# interfaces
.implements Ll/ۨ۠ۚ;


# instance fields
.field public final synthetic ۙ:Ll/۬ܺۤ;


# direct methods
.method public synthetic constructor <init>(Ll/۬ܺۤ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ۢۚ;->ۙ:Ll/۬ܺۤ;

    return-void
.end method


# virtual methods
.method public final ۙ(J[BII)I
    .locals 1

    .line 63
    iget-object v0, p0, Ll/᩶ۢۚ;->ۙ:Ll/۬ܺۤ;

    invoke-virtual {v0, p1, p2}, Ll/۬ܺۤ;->seek(J)V

    .line 64
    invoke-virtual {v0, p3, p4, p5}, Ll/۬ܺۤ;->read([BII)I

    move-result p1

    return p1
.end method
