.class public final synthetic Ll/ۢ᩺ۧ;
.super Ljava/lang/Object;
.source "K14B"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/ۤۘۧ;


# direct methods
.method public synthetic constructor <init>(Ll/ۤۘۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢ᩺ۧ;->ܰ:Ll/ۤۘۧ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 175
    new-instance v0, Ll/۫ۡۗ;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/۫ۡۗ;-><init>(I)V

    iget-object v1, p0, Ll/ۢ᩺ۧ;->ܰ:Ll/ۤۘۧ;

    invoke-virtual {v1, v0}, Ll/ۡ֫ۧ;->ۙ(Ljava/util/function/Consumer;)V

    return-void
.end method
