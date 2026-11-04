.class public final synthetic Ll/᩷ۖ۫;
.super Ljava/lang/Object;
.source "V8F2"

# interfaces
.implements Ll/ۤ֨ܳ;
.implements Ll/ۖ֡᩺;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩷ۖ۫;->ܰ:Ljava/lang/Object;

    iput-object p2, p0, Ll/᩷ۖ۫;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Landroid/widget/TextView;)V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/᩷ۖ۫;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/᩸ۖ۫;

    iget-object v1, p0, Ll/᩷ۖ۫;->᩶:Ljava/lang/Object;

    check-cast v1, Landroid/widget/TextView;

    invoke-static {v0, v1, p1}, Ll/᩸ۖ۫;->ۙ(Ll/᩸ۖ۫;Landroid/widget/TextView;Landroid/widget/TextView;)V

    return-void
.end method

.method public ۙ(Ll/۠֡᩺;)V
    .locals 0

    .line 1907
    invoke-static {}, Ll/ۧ᩻ܺ;->ۙ()V

    const/4 p1, 0x0

    throw p1
.end method

.method public ۙ(Ll/۠֡᩺;Ll/֨֡᩺;Ll/᩸۟᩺;Z)V
    .locals 1

    .line 2
    iget-object p4, p0, Ll/᩷ۖ۫;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast p4, Ll/۠֡᩺;

    .line 6
    iget-object v0, p0, Ll/᩷ۖ۫;->᩶:Ljava/lang/Object;

    .line 8
    check-cast v0, Ll/ܿᩳۘ;

    .line 11
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ne p1, p4, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 2164
    :goto_0
    invoke-static {p1}, Ll/ۧ᩻ܺ;->ۙ(Z)V

    .line 2165
    new-instance p1, Ll/ۚۢۘ;

    invoke-direct {p1, p2, p3}, Ll/ۚۢۘ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 227
    invoke-virtual {v0, p1}, Ll/ܿᩳۘ;->ۙ(Ljava/lang/Object;)V

    return-void
.end method
