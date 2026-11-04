.class public final synthetic Ll/ۛ᩷ۚ;
.super Ljava/lang/Object;
.source "J6WT"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ֡:Ljava/lang/Object;

.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ll/۠ۖۧ;I)V
    .locals 0

    .line 0
    iput p4, p0, Ll/ۛ᩷ۚ;->ܰ:I

    iput-object p1, p0, Ll/ۛ᩷ۚ;->᩶:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۛ᩷ۚ;->ܿ:Ljava/lang/Object;

    iput-object p3, p0, Ll/ۛ᩷ۚ;->֡:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lbin/mt/plus/Main;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput v0, p0, Ll/ۛ᩷ۚ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛ᩷ۚ;->ܿ:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۛ᩷ۚ;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/ۛ᩷ۚ;->֡:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 2
    iget v0, p0, Ll/ۛ᩷ۚ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/ۛ᩷ۚ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast p1, Ll/۠᩺۫;

    .line 11
    iget-object v0, p0, Ll/ۛ᩷ۚ;->ܿ:Ljava/lang/Object;

    .line 13
    check-cast v0, Ll/᩷ۘ۫;

    .line 15
    iget-object v1, p0, Ll/ۛ᩷ۚ;->֡:Ljava/lang/Object;

    .line 17
    check-cast v1, Ll/۠ۖۧ;

    .line 20
    invoke-static {p1, v0, v1}, Ll/᩷ۘ۫;->ۙ(Ll/۠᩺۫;Ll/᩷ۘ۫;Ll/۠ۖۧ;)V

    return-void

    .line 23
    :pswitch_0
    iget-object p1, p0, Ll/ۛ᩷ۚ;->ܿ:Ljava/lang/Object;

    .line 25
    check-cast p1, Ljava/lang/String;

    .line 27
    iget-object v0, p0, Ll/ۛ᩷ۚ;->᩶:Ljava/lang/Object;

    .line 29
    check-cast v0, Lbin/mt/plus/Main;

    .line 31
    iget-object v1, p0, Ll/ۛ᩷ۚ;->֡:Ljava/lang/Object;

    .line 33
    check-cast v1, Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 263
    invoke-virtual {v0, p1}, Ll/ܽ֡֫;->᩷(Ljava/lang/String;)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    if-eqz p1, :cond_1

    const/4 p1, -0x1

    goto :goto_1

    :cond_1
    const p1, 0x7f120c2a

    .line 266
    :goto_1
    invoke-static {p1, v1}, Ll/᩶᩷ۧ;->ۙ(ILjava/lang/CharSequence;)V

    :cond_2
    return-void

    .line 0
    :pswitch_1
    iget-object v0, p0, Ll/ۛ᩷ۚ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/۠᩷ۚ;

    iget-object v1, p0, Ll/ۛ᩷ۚ;->ܿ:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Ll/ۛ᩷ۚ;->֡:Ljava/lang/Object;

    check-cast v2, Ll/۠ۖۧ;

    invoke-static {v0, v1, v2, p1}, Ll/۠᩷ۚ;->ۙ(Ll/۠᩷ۚ;Ljava/lang/String;Ll/۠ۖۧ;Landroid/view/View;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
