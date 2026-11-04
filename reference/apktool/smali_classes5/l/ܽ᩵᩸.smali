.class public final synthetic Ll/ܽ᩵᩸;
.super Ljava/lang/Object;
.source "T6QN"

# interfaces
.implements Ll/᩻ܶ᩵;


# instance fields
.field public final synthetic ܰ:Ll/ܶ᩵᩸;


# direct methods
.method public synthetic constructor <init>(Ll/ܶ᩵᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ᩵᩸;->ܰ:Ll/ܶ᩵᩸;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 2
    check-cast p1, Ljava/lang/Throwable;

    .line 575
    iget-object v0, p0, Ll/ܽ᩵᩸;->ܰ:Ll/ܶ᩵᩸;

    iget-object v0, v0, Ll/ܶ᩵᩸;->ܽ:Ll/ۚ᩹᩸;

    invoke-virtual {v0}, Ll/ۚ᩹᩸;->ۙ()Ll/᩹ܽ᩵;

    move-result-object v0

    new-instance v1, Ll/ܳ᩵᩸;

    invoke-direct {v1, p1}, Ll/ܳ᩵᩸;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/᩹ܽ᩵;->ۙ(Ll/ۧܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object p1

    return-object p1
.end method
