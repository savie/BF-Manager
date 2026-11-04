.class public final synthetic Ll/ܶۚ֫;
.super Ljava/lang/Object;
.source "X8H6"

# interfaces
.implements Ll/ۨ᩺ۙ;
.implements Ll/ۨ۠ۚ;


# instance fields
.field public final synthetic ۙ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܶۚ֫;->ۙ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۙ(J[BII)I
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ܶۚ֫;->ۙ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/۬ܺۤ;

    .line 29
    invoke-virtual {v0, p1, p2}, Ll/۬ܺۤ;->seek(J)V

    .line 30
    invoke-virtual {v0, p3, p4, p5}, Ll/۬ܺۤ;->read([BII)I

    move-result p1

    return p1
.end method

.method public ۙ(Ljava/net/URL;Ljava/util/AbstractMap;)Ljava/util/Map;
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ܶۚ֫;->ۙ:Ljava/lang/Object;

    check-cast v0, Ll/ۧۤ֫;

    invoke-virtual {v0, p1, p2}, Ll/ۧۤ֫;->ۙ(Ljava/net/URL;Ljava/util/AbstractMap;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
