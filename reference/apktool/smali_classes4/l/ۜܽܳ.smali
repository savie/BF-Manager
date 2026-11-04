.class public final synthetic Ll/ۜܽܳ;
.super Ljava/lang/Object;
.source "W6DR"

# interfaces
.implements Ljava/util/function/IntConsumer;


# instance fields
.field public final synthetic ܰ:Ll/֫ܶܳ;

.field public final synthetic ᩶:Ll/֨ܽܳ;


# direct methods
.method public synthetic constructor <init>(Ll/֫ܶܳ;Ll/֨ܽܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜܽܳ;->ܰ:Ll/֫ܶܳ;

    iput-object p2, p0, Ll/ۜܽܳ;->᩶:Ll/֨ܽܳ;

    return-void
.end method


# virtual methods
.method public final accept(I)V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ۜܽܳ;->ܰ:Ll/֫ܶܳ;

    iget-object v1, p0, Ll/ۜܽܳ;->᩶:Ll/֨ܽܳ;

    invoke-static {v0, v1, p1}, Ll/֫ܶܳ;->ۙ(Ll/֫ܶܳ;Ll/֨ܽܳ;I)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۘۧۗ;->$default$andThen(Ljava/util/function/IntConsumer;Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;

    move-result-object p1

    return-object p1
.end method
