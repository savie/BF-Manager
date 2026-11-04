.class public final synthetic Ll/ۙۧ᩺;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۙۧ᩺;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    .line 2
    iget v0, p0, Ll/ۙۧ᩺;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    new-instance v0, Ll/֡۠᩹;

    .line 10
    invoke-direct {v0}, Ll/֡۠᩹;-><init>()V

    return-object v0

    .line 121
    :pswitch_0
    invoke-static {}, Ll/᩻᩻᩺;->᩷()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Options:\n"

    const-string v2, "\n"

    .line 0
    invoke-static {v1, v0, v2}, Ll/ܰ۟ۙ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
