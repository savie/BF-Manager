.class public final synthetic Ll/ۙܶܳ;
.super Ljava/lang/Object;
.source "W6DR"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/ۤܶܳ;

.field public final synthetic ᩶:I


# direct methods
.method public synthetic constructor <init>(Ll/ۤܶܳ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙܶܳ;->ܰ:Ll/ۤܶܳ;

    iput p2, p0, Ll/ۙܶܳ;->᩶:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 335
    iget-object v0, p0, Ll/ۙܶܳ;->ܰ:Ll/ۤܶܳ;

    iget-object v0, v0, Ll/ۤܶܳ;->ܰ:Ll/֫ܶܳ;

    invoke-static {v0}, Ll/֫ܶܳ;->ܳ(Ll/֫ܶܳ;)Ll/᩶ܶܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩶ܶܳ;->᩸()Ll/֨ܽܳ;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/֫ܶܳ;->ܳ(Ll/֫ܶܳ;)Ll/᩶ܶܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶ܶܳ;->᩸()Ll/֨ܽܳ;

    move-result-object v0

    iget v1, p0, Ll/ۙܶܳ;->᩶:I

    invoke-virtual {v0, v1}, Ll/֨ܽܳ;->ۙ(I)V

    :cond_0
    return-void
.end method
