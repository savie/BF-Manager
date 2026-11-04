.class public final synthetic Ll/ܺ᩻ܺ;
.super Ljava/lang/Object;
.source "PAIZ"

# interfaces
.implements Ll/ᩴ֨᩵;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܺ᩻ܺ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ()Ljava/lang/Object;
    .locals 4

    .line 2
    iget v0, p0, Ll/ܺ᩻ܺ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 59
    invoke-static {}, Ll/᩺ۧܺ;->ۙ()Ll/ۛܳۨ;

    move-result-object v0

    .line 60
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0xa

    invoke-virtual {v0, v2, v3, v1}, Ll/ۛܳۨ;->ۙ(JLjava/util/concurrent/TimeUnit;)V

    .line 61
    invoke-virtual {v0, v2, v3, v1}, Ll/ۛܳۨ;->ۤ(JLjava/util/concurrent/TimeUnit;)V

    const-wide/16 v2, 0xf

    .line 62
    invoke-virtual {v0, v2, v3, v1}, Ll/ۛܳۨ;->᩷(JLjava/util/concurrent/TimeUnit;)V

    const-wide/16 v1, 0x19

    .line 63
    invoke-virtual {v0, v1, v2}, Ll/ۛܳۨ;->ۙ(J)V

    .line 64
    new-instance v1, Ll/۫۠֫;

    .line 14
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 64
    invoke-virtual {v0, v1}, Ll/ۛܳۨ;->ۙ(Ll/ܽܳۨ;)V

    .line 67
    invoke-virtual {v0}, Ll/ۛܳۨ;->ۙ()Ll/᩺ܳۨ;

    move-result-object v0

    return-object v0

    .line 0
    :pswitch_0
    invoke-static {}, Ll/᩹᩻ܺ;->ۙ()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
