.class public final synthetic Ll/۠᩷ܺ;
.super Ljava/lang/Object;
.source "X5CP"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ܰ:Lbin/mt/plus/Main;

.field public final synthetic ܿ:Ll/ۙۤܺ;

.field public final synthetic ᩶:[Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;[Ljava/lang/String;Ll/ۙۤܺ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠᩷ܺ;->ܰ:Lbin/mt/plus/Main;

    iput-object p2, p0, Ll/۠᩷ܺ;->᩶:[Ljava/lang/String;

    iput-object p3, p0, Ll/۠᩷ܺ;->ܿ:Ll/ۙۤܺ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    const/16 p1, 0x5c7e

    .line 61
    iget-object p2, p0, Ll/۠᩷ܺ;->ܰ:Lbin/mt/plus/Main;

    iget-object v0, p0, Ll/۠᩷ܺ;->᩶:[Ljava/lang/String;

    invoke-static {p2, v0, p1}, Ll/ܰ᩶;->ۙ(Landroid/app/Activity;[Ljava/lang/String;I)V

    return-void

    .line 63
    :cond_0
    iget-object p1, p0, Ll/۠᩷ܺ;->ܿ:Ll/ۙۤܺ;

    invoke-interface {p1}, Ll/ۙۤܺ;->ۙ()V

    return-void
.end method
