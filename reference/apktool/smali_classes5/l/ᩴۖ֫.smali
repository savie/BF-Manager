.class public final Ll/ᩴۖ֫;
.super Ll/֫ܿ᩻;
.source "E72G"


# instance fields
.field public final synthetic ۙۙ:Ll/ۘۖ֫;


# direct methods
.method public constructor <init>(Ll/ۘۖ֫;Ll/ۘۖ֫;)V
    .locals 0

    .line 450
    iput-object p1, p0, Ll/ᩴۖ֫;->ۙۙ:Ll/ۘۖ֫;

    invoke-direct {p0, p2}, Ll/֫ܿ᩻;-><init>(Ll/ۘۖ֫;)V

    return-void
.end method


# virtual methods
.method public final onScrollChanged(IIII)V
    .locals 0

    .line 453
    invoke-super {p0, p1, p2, p3, p4}, Ll/֫ܿ᩻;->onScrollChanged(IIII)V

    .line 454
    iget-object p1, p0, Ll/ᩴۖ֫;->ۙۙ:Ll/ۘۖ֫;

    invoke-static {p1}, Ll/ۘۖ֫;->ܶ(Ll/ۘۖ֫;)Ll/ۢ۬֫;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-static {p1}, Ll/ۘۖ֫;->ܶ(Ll/ۘۖ֫;)Ll/ۢ۬֫;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۢ۬֫;->ۧ()V

    .line 456
    :cond_0
    invoke-static {p1}, Ll/ۘۖ֫;->᩻(Ll/ۘۖ֫;)Ll/۟ۖ֫;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 457
    invoke-static {p1}, Ll/ۘۖ֫;->᩻(Ll/ۘۖ֫;)Ll/۟ۖ֫;

    move-result-object p1

    invoke-virtual {p1}, Ll/۟ۖ֫;->ۙ()V

    :cond_1
    return-void
.end method
