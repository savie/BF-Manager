.class public final synthetic Ll/ۙ᩷᩵;
.super Ljava/lang/Object;
.source "Q6FB"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput v0, p0, Ll/ۙ᩷᩵;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/֨ۢ᩻;)V
    .locals 0

    const/4 p1, 0x1

    .line 0
    iput p1, p0, Ll/ۙ᩷᩵;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    .line 2
    iget v0, p0, Ll/ۙ᩷᩵;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/ܽ֡֫;

    const-string v0, "activity"

    .line 0
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    sget v0, Ll/֨ۢ᩻;->ᩴ:I

    .line 353
    new-instance v0, Ll/۬֨ᩴ;

    const v1, 0x7f12057b

    invoke-direct {v0, p1, v1}, Ll/۬֨ᩴ;-><init>(Ll/ܽ֡֫;I)V

    invoke-virtual {v0}, Ll/۬֨ᩴ;->ܳ()V

    .line 354
    new-instance v1, Ll/ܿۛܳ;

    invoke-direct {v1, v0}, Ll/ܿۛܳ;-><init>(Ljava/lang/Object;)V

    sget-object v0, Ll/ۧ۬᩻;->᩸:Ljava/util/concurrent/locks/ReentrantLock;

    .line 743
    new-instance v0, Ljava/lang/Thread;

    new-instance v2, Ll/ۧ᩷ۧ;

    const/4 v3, 0x4

    invoke-direct {v2, v3, p1, v1}, Ll/ۧ᩷ۧ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void

    .line 0
    :pswitch_0
    check-cast p1, Ll/᩷ۡۗ;

    invoke-static {p1}, Ll/ܳ᩷᩵;->ۙ(Ll/᩷ۡۗ;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
