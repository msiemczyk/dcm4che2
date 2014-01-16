/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is part of dcm4che, an implementation of DICOM(TM) in
 * Java(TM), available at http://sourceforge.net/projects/dcm4che.
 *
 * The Initial Developer of the Original Code is
 * Agfa HealthCare.
 * Portions created by the Initial Developer are Copyright (C) 2010
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 * See listed authors below.
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 *
 * ***** END LICENSE BLOCK ***** */

package org.dcm4che2.code;

/**
 * CID 3609 Ventricular source locations.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class VentricularSourceLocations {

  /** (T-32400, SRT, "Common ventricle") */
  public static final String CommonVentricle = "T-32400\\SRT";

  /** (T-32600, SRT, "Left ventricle") */
  public static final String LeftVentricle = "T-32600\\SRT";

  /** (T-32602, SRT, "Left ventricle apex") */
  public static final String LeftVentricleApex = "T-32602\\SRT";

  /** (T-32640, SRT, "Left ventricle inflow") */
  public static final String LeftVentricleInflow = "T-32640\\SRT";

  /** (D4-31022, SRT, "Left ventricle outflow chamber") */
  public static final String LeftVentricleOutflowChamber = "D4-31022\\SRT";

  /** (T-32650, SRT, "Left ventricle outflow tract") */
  public static final String LeftVentricleOutflowTract = "T-32650\\SRT";

  /** (T-32500, SRT, "Right ventricle") */
  public static final String RightVentricle = "T-32500\\SRT";

  /** (T-32502, SRT, "Right ventricle apex") */
  public static final String RightVentricleApex = "T-32502\\SRT";

  /** (T-32540, SRT, "Right ventricle inflow") */
  public static final String RightVentricleInflow = "T-32540\\SRT";

  /** (D4-31032, SRT, "Right ventricle outflow chamber") */
  public static final String RightVentricleOutflowChamber = "D4-31032\\SRT";

  /** (T-32550, SRT, "Right ventricle outflow tract") */
  public static final String RightVentricleOutflowTract = "T-32550\\SRT";
}