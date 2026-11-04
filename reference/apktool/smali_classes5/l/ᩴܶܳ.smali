.class public final synthetic Ll/ᩴܶܳ;
.super Ljava/lang/Object;
.source "W6DR"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/ܳܶܳ;

.field public final synthetic ᩶:I


# direct methods
.method public synthetic constructor <init>(Ll/ܳܶܳ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴܶܳ;->ܰ:Ll/ܳܶܳ;

    iput p2, p0, Ll/ᩴܶܳ;->᩶:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 382
    iget-object v0, p0, Ll/ᩴܶܳ;->ܰ:Ll/ܳܶܳ;

    iget-object v0, v0, Ll/ܳܶܳ;->ܰ:Ll/֫ܶܳ;

    invoke-static {v0}, Ll/֫ܶܳ;->۫(Ll/֫ܶܳ;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Ll/֫ܶܳ;->ۙ(Ll/֫ܶܳ;Z)V

    .line 383
    iget v1, p0, Ll/ᩴܶܳ;->᩶:I

    invoke-static {v0, v1}, Ll/֫ܶܳ;->ۙ(Ll/֫ܶܳ;I)V

    return-void
.end method
