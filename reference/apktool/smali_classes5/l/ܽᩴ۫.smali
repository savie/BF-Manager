.class public final synthetic Ll/ܽᩴ۫;
.super Ljava/lang/Object;
.source "6B6V"

# interfaces
.implements Ll/᩸ۗܳ;


# instance fields
.field public final synthetic ۙ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܽᩴ۫;->ۙ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create()Ll/ۢۗܳ;
    .locals 2

    .line 2
    iget v0, p0, Ll/ܽᩴ۫;->ۙ:I

    packed-switch v0, :pswitch_data_0

    .line 111
    new-instance v0, Ll/ۘ᩹۫;

    const-string v1, "compress"

    invoke-direct {v0, v1}, Ll/ۘ᩹۫;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 60
    :pswitch_0
    new-instance v0, Ll/ۖ۫۫;

    const-string v1, "archive"

    invoke-direct {v0, v1}, Ll/ۖ۫۫;-><init>(Ljava/lang/String;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
