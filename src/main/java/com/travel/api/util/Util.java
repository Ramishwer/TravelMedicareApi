package com.travel.api.util;

import java.math.MathContext;
import java.math.RoundingMode;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
// TODO: Auto-generated Javadoc
/**
 * The Class Util.
 */
public class Util {

	/**
	 * Sets the header.
	 *
	 * @param userId the user id
	 * @param res    the res
	 */
	public static final void setHeader(String userId, HttpServletResponse res) {
		if (userId != null && !"".equals(userId) && !"undefined".equals(userId)) {
			res.setIntHeader("sessionUserId", Integer.parseInt(userId));
		} else {
			res.setHeader("sessionUserId", userId);
		}
		res.setHeader("Access-Control-Expose-Headers", "*");

	}

	public static final String getStringWithMinimum(int min, String str) {
		if (str == null) {
			str = "";
		}
		StringBuilder result = new StringBuilder(str);
		if (str.length() < min) {
			for (int i = str.length(); i < min; i++) {
				result.append(" ");
			}
		}
		return result.toString();
	}

	/**
	 * Gets the header.
	 *
	 * @param req the req
	 * @param res the res
	 * @return the header
	 */
	public static final String getHeader(HttpServletRequest req, HttpServletResponse res) {
		return req.getHeader("sessionUserId");
	}

	public static final String getHeaderResponse(HttpServletRequest req, HttpServletResponse res) {
		return res.getHeader("•	x-csrf-token");
	}

	public static final void memset(StringBuilder sb, char c, int length) {
		int lengthToAdd = 0;
		if (sb.length() < length) {
			lengthToAdd = length - sb.length();
			length = sb.length();
		}
		for (int i = 0; i < length; i++) {
			sb.setCharAt(i, c);
		}
		for (int i = 0; i < lengthToAdd; i++) {
			sb.append(c);
		}
	}

	public static final MathContext DECIMAL32 = new MathContext(7, RoundingMode.HALF_EVEN);

	public static final boolean checkDigitEAN(StringBuilder sb, int length) {
		boolean res = true;
		if (sb.length() < length - 1) {
			memset(sb, '9', length - 1);
			sb.append('0');
			res = false;
		} else {
			long evenSum = 0;
			long oddSum = 0;
			int i = length - 2;
			while (i >= 0) {
				evenSum += (int) sb.charAt(i) - (int) '0';
				i--;
				if (i < 0) {
					break;
				}
				oddSum += (int) sb.charAt(i) - (int) '0';
				i--;
			}
			long sum = evenSum * 3 + oddSum;
			int digit = (int) (sum % 10);
			if (digit > 0) {
				digit = 10 - digit;
			}
			sb.append(String.valueOf(digit).charAt(0));
		}
		return res;
	}

	/**
	 * Validate session.
	 *
	 * @param req the req
	 * @return true, if successful
	 */
	public static final boolean validateSession(HttpServletRequest req) {
		boolean vaildSession = false;
		if (req != null && req.getSession().getAttribute("UserLoginBean") != null) {
			vaildSession = true;
		}
		return vaildSession;

	}

}
