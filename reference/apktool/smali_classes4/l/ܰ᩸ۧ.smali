.class public final synthetic Ll/ܰ᩸ۧ;
.super Ljava/lang/Object;
.source "K6KF"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ֡:Ljava/io/Serializable;

.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;I)V
    .locals 0

    .line 0
    iput p4, p0, Ll/ܰ᩸ۧ;->ܰ:I

    iput-object p1, p0, Ll/ܰ᩸ۧ;->᩶:Ljava/lang/Object;

    iput-object p2, p0, Ll/ܰ᩸ۧ;->ܿ:Ljava/lang/Object;

    iput-object p3, p0, Ll/ܰ᩸ۧ;->֡:Ljava/io/Serializable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 0
    iget v0, p0, Ll/ܰ᩸ۧ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p0, Ll/ܰ᩸ۧ;->᩶:Ljava/lang/Object;

    check-cast p1, Ll/ۚۚᩴ;

    iget-object p2, p0, Ll/ܰ᩸ۧ;->ܿ:Ljava/lang/Object;

    check-cast p2, Ll/᩷ۨᩴ;

    iget-object v0, p0, Ll/ܰ᩸ۧ;->֡:Ljava/io/Serializable;

    check-cast v0, [I

    invoke-static {p1, p2, v0}, Ll/ۚۚᩴ;->ۙ(Ll/ۚۚᩴ;Ll/᩷ۨᩴ;[I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/ܰ᩸ۧ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܿ᩸ۧ;

    iget-object v1, p0, Ll/ܰ᩸ۧ;->ܿ:Ljava/lang/Object;

    check-cast v1, Ll/ܽ֡֫;

    iget-object v2, p0, Ll/ܰ᩸ۧ;->֡:Ljava/io/Serializable;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1, p2}, Ll/ܿ᩸ۧ;->ۙ(Ll/ܿ᩸ۧ;Ll/ܽ֡֫;Ljava/lang/String;Landroid/content/DialogInterface;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
