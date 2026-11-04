.class public final synthetic Ll/᩶ܳۧ;
.super Ljava/lang/Object;
.source "V6YU"

# interfaces
.implements Landroid/content/DialogInterface$OnMultiChoiceClickListener;


# instance fields
.field public final synthetic ۙ:I

.field public final synthetic ᩷:[Z


# direct methods
.method public synthetic constructor <init>([ZI)V
    .locals 0

    .line 0
    iput p2, p0, Ll/᩶ܳۧ;->ۙ:I

    iput-object p1, p0, Ll/᩶ܳۧ;->᩷:[Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;IZ)V
    .locals 1

    .line 2
    iget p1, p0, Ll/᩶ܳۧ;->ۙ:I

    .line 4
    iget-object v0, p0, Ll/᩶ܳۧ;->᩷:[Z

    packed-switch p1, :pswitch_data_0

    .line 9
    sget p1, Ll/ۛۙ᩸;->ܺ᩷:I

    .line 440
    aput-boolean p3, v0, p2

    return-void

    .line 74
    :pswitch_0
    aput-boolean p3, v0, p2

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
