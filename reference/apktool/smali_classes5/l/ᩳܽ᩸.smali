.class public final synthetic Ll/ᩳܽ᩸;
.super Ljava/lang/Object;
.source "J57L"

# interfaces
.implements Landroid/content/DialogInterface$OnMultiChoiceClickListener;


# instance fields
.field public final synthetic ۙ:I

.field public final synthetic ᩷:[Z


# direct methods
.method public synthetic constructor <init>([ZI)V
    .locals 0

    .line 0
    iput p2, p0, Ll/ᩳܽ᩸;->ۙ:I

    iput-object p1, p0, Ll/ᩳܽ᩸;->᩷:[Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;IZ)V
    .locals 0

    .line 2
    iget p1, p0, Ll/ᩳܽ᩸;->ۙ:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/ᩳܽ᩸;->᩷:[Z

    .line 73
    aput-boolean p3, p1, p2

    return-void

    .line 0
    :pswitch_0
    iget-object p1, p0, Ll/ᩳܽ᩸;->᩷:[Z

    .line 181
    aput-boolean p3, p1, p2

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
