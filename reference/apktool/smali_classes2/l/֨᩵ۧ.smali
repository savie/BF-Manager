.class public final synthetic Ll/֨᩵ۧ;
.super Ljava/lang/Object;
.source "4BN4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ljava/io/Serializable;

.field public final synthetic ۟:Ljava/lang/Object;

.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩳ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p6, p0, Ll/֨᩵ۧ;->ܰ:I

    iput-object p1, p0, Ll/֨᩵ۧ;->᩶:Ljava/lang/Object;

    iput-object p2, p0, Ll/֨᩵ۧ;->ܿ:Ljava/lang/Object;

    iput-object p3, p0, Ll/֨᩵ۧ;->֡:Ljava/io/Serializable;

    iput-object p4, p0, Ll/֨᩵ۧ;->۟:Ljava/lang/Object;

    iput-object p5, p0, Ll/֨᩵ۧ;->ᩳ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 0
    iget v0, p0, Ll/֨᩵ۧ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/֨᩵ۧ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/᩷᩶۫;

    iget-object v1, p0, Ll/֨᩵ۧ;->ܿ:Ljava/lang/Object;

    check-cast v1, Lcom/amazonaws/services/s3/model/PutObjectRequest;

    iget-object v2, p0, Ll/֨᩵ۧ;->֡:Ljava/io/Serializable;

    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Ll/֨᩵ۧ;->۟:Ljava/lang/Object;

    check-cast v3, Ll/۬ۧۨ;

    iget-object v4, p0, Ll/֨᩵ۧ;->ᩳ:Ljava/lang/Object;

    check-cast v4, Ljava/util/concurrent/CountDownLatch;

    invoke-static {v0, v1, v2, v3, v4}, Ll/᩷᩶۫;->ۙ(Ll/᩷᩶۫;Lcom/amazonaws/services/s3/model/PutObjectRequest;Ljava/util/concurrent/atomic/AtomicReference;Ll/۬ۧۨ;Ljava/util/concurrent/CountDownLatch;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/֨᩵ۧ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/᩷ۨۧ;

    iget-object v1, p0, Ll/֨᩵ۧ;->ܿ:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/֨᩵ۧ;->֡:Ljava/io/Serializable;

    check-cast v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/֨᩵ۧ;->۟:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    iget-object v4, p0, Ll/֨᩵ۧ;->ᩳ:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    invoke-static {v0, v1, v2, v3, v4}, Ll/᩷ۨۧ;->ۙ(Ll/᩷ۨۧ;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
