.class public final synthetic Ll/ۗ۫᩵;
.super Ljava/lang/Object;
.source "B6I6"

# interfaces
.implements Ll/ۘܳ᩵;


# instance fields
.field public final synthetic ܰ:Z


# direct methods
.method public synthetic constructor <init>(ZLl/֫֨ۗ;Ll/ܺ֨ۗ;Ll/ᩳۡۗ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ll/ۗ۫᩵;->ܰ:Z

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۙۚ᩵;)Ll/ۙۚ᩵;
    .locals 2

    .line 473
    sget-object v0, Ll/ۙۚ᩵;->֡:Ll/ۙۚ᩵;

    iget-boolean v1, p0, Ll/ۗ۫᩵;->ܰ:Z

    if-ne p1, v0, :cond_0

    if-nez v1, :cond_0

    .line 478
    sget-object p1, Ll/ۙۚ᩵;->ܿ:Ll/ۙۚ᩵;

    return-object p1

    .line 480
    :cond_0
    sget-object v0, Ll/ۙۚ᩵;->ܿ:Ll/ۙۚ᩵;

    if-ne p1, v0, :cond_1

    if-eqz v1, :cond_1

    .line 481
    sget-object p1, Ll/ۙۚ᩵;->᩶:Ll/ۙۚ᩵;

    :cond_1
    return-object p1
.end method
