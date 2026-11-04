.class public final synthetic Ll/ܶ۫۫;
.super Ljava/lang/Object;
.source "K7BU"

# interfaces
.implements Ll/ܺ۫۫;
.implements Ll/᩶ۚܺ;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܶ۫۫;->ܰ:Ljava/lang/Object;

    iput-object p2, p0, Ll/ܶ۫۫;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۙ(Ljava/lang/String;)V
    .locals 8

    .line 2
    iget-object v0, p0, Ll/ܶ۫۫;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۖۗܳ;

    .line 6
    iget-object v1, p0, Ll/ܶ۫۫;->᩶:Ljava/lang/Object;

    .line 9
    move-object v3, v1

    check-cast v3, Ll/۠ۨܳ;

    .line 74
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v4

    .line 75
    invoke-interface {v0}, Ll/ۖۗܳ;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v5, p1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    move-object v5, v0

    :goto_0
    invoke-virtual {v3}, Ll/۠ۨܳ;->ۗ()Ljava/lang/String;

    move-result-object v6

    move-object v7, p1

    .line 74
    invoke-static/range {v2 .. v7}, Ll/ۗ۫۫;->ۙ(Ljava/util/List;Ll/۠ۨܳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/۠ۜۧ;

    move-result-object p1

    .line 75
    invoke-virtual {p1}, Ll/۠ۜۧ;->ۙ()I

    return-void
.end method

.method public ᩷()Landroid/graphics/Bitmap;
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ܶ۫۫;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/᩷ۨᩴ;

    .line 6
    iget-object v1, p0, Ll/ܶ۫۫;->᩶:Ljava/lang/Object;

    .line 8
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 456
    invoke-static {v0}, Ll/۠֡᩻;->ۤ(Ll/᩷ۨᩴ;)Ll/ۗ۬ۚ;

    move-result-object v0

    .line 457
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 458
    invoke-virtual {v0}, Ll/ۗ۬ۚ;->ۙ()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
