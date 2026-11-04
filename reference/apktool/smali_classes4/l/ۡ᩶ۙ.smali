.class public final synthetic Ll/ۡ᩶ۙ;
.super Ljava/lang/Object;
.source "48SH"

# interfaces
.implements Ll/ۜۙܽ;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۡ᩶ۙ;->ܰ:I

    iput-object p2, p0, Ll/ۡ᩶ۙ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 2
    iget v0, p0, Ll/ۡ᩶ۙ;->ܰ:I

    .line 4
    iget-object v1, p0, Ll/ۡ᩶ۙ;->᩶:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/᩷ۨᩴ;

    .line 11
    sget v0, Ll/۠ܺ۫;->ۗۙ:I

    .line 204
    new-instance v0, Ll/ܶܽܺ;

    invoke-virtual {v1}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ܶܽܺ;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 0
    :pswitch_0
    check-cast v1, Landroid/content/ContextWrapper;

    .line 427
    invoke-static {v1}, Ll/ۗᩴ᩷;->ۙ(Landroid/content/ContextWrapper;)Ll/ۗᩴ᩷;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
