.class public final synthetic Lbin/mt/plugin/api/util/AsyncTask$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "AsyncTask"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic $r8$classId:I

.field public final synthetic f$0:Ljava/lang/Object;

.field public final synthetic f$1:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Lbin/mt/plugin/api/util/AsyncTask$$ExternalSyntheticLambda1;->$r8$classId:I

    iput-object p2, p0, Lbin/mt/plugin/api/util/AsyncTask$$ExternalSyntheticLambda1;->f$0:Ljava/lang/Object;

    iput-object p3, p0, Lbin/mt/plugin/api/util/AsyncTask$$ExternalSyntheticLambda1;->f$1:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget v0, p0, Lbin/mt/plugin/api/util/AsyncTask$$ExternalSyntheticLambda1;->$r8$classId:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbin/mt/plugin/api/util/AsyncTask$$ExternalSyntheticLambda1;->f$0:Ljava/lang/Object;

    check-cast v0, Ll/᩵ܽۧ;

    iget-object v1, p0, Lbin/mt/plugin/api/util/AsyncTask$$ExternalSyntheticLambda1;->f$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Runnable;

    invoke-static {v0, v1}, Ll/᩵ܽۧ;->ۙ(Ll/᩵ܽۧ;Ljava/lang/Runnable;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lbin/mt/plugin/api/util/AsyncTask$$ExternalSyntheticLambda1;->f$0:Ljava/lang/Object;

    check-cast v0, Lbin/mt/plugin/api/util/AsyncTask;

    iget-object v1, p0, Lbin/mt/plugin/api/util/AsyncTask$$ExternalSyntheticLambda1;->f$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Exception;

    invoke-static {v0, v1}, Lbin/mt/plugin/api/util/AsyncTask;->$r8$lambda$OrI7lgWXTNktdasgjDHBAiIOQtY(Lbin/mt/plugin/api/util/AsyncTask;Ljava/lang/Exception;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
