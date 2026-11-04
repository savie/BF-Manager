.class public final synthetic Ll/֨ۧ֫;
.super Ljava/lang/Object;
.source "V6MU"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ll/᩹ܺ֫;

.field public final synthetic ۟:Ll/ۜۧ֫;

.field public final synthetic ۢ:Ll/֨۠ۚ;

.field public final synthetic ܰ:Ll/᩷᩻֫;

.field public final synthetic ܿ:J

.field public final synthetic ᩳ:I

.field public final synthetic ᩶:Ll/ۧۜۚ;


# direct methods
.method public synthetic constructor <init>(Ll/᩷᩻֫;Ll/ۧۜۚ;JLl/᩹ܺ֫;Ll/ۜۧ֫;ILl/֨۠ۚ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۧ֫;->ܰ:Ll/᩷᩻֫;

    iput-object p2, p0, Ll/֨ۧ֫;->᩶:Ll/ۧۜۚ;

    iput-wide p3, p0, Ll/֨ۧ֫;->ܿ:J

    iput-object p5, p0, Ll/֨ۧ֫;->֡:Ll/᩹ܺ֫;

    iput-object p6, p0, Ll/֨ۧ֫;->۟:Ll/ۜۧ֫;

    iput p7, p0, Ll/֨ۧ֫;->ᩳ:I

    iput-object p8, p0, Ll/֨ۧ֫;->ۢ:Ll/֨۠ۚ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 0
    iget v6, p0, Ll/֨ۧ֫;->ᩳ:I

    iget-object v7, p0, Ll/֨ۧ֫;->ۢ:Ll/֨۠ۚ;

    iget-object v0, p0, Ll/֨ۧ֫;->ܰ:Ll/᩷᩻֫;

    iget-object v1, p0, Ll/֨ۧ֫;->᩶:Ll/ۧۜۚ;

    iget-wide v2, p0, Ll/֨ۧ֫;->ܿ:J

    iget-object v4, p0, Ll/֨ۧ֫;->֡:Ll/᩹ܺ֫;

    iget-object v5, p0, Ll/֨ۧ֫;->۟:Ll/ۜۧ֫;

    invoke-static/range {v0 .. v7}, Ll/᩷᩻֫;->ۙ(Ll/᩷᩻֫;Ll/ۧۜۚ;JLl/᩹ܺ֫;Ll/ۜۧ֫;ILl/֨۠ۚ;)V

    return-void
.end method
